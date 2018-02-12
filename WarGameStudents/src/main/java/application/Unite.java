package application;

import application.genre.Genre;
import application.genre.Standard;

public class Unite implements IUnite {

	String nom;
	
	int att,def,mvt,portee,vie,xpos,ypos;
	
	boolean empoisonne;
	int dureeempoisonnement;
	
	Genre g;

	public Unite(String nom, int att, int def, int mvt, int portee, int vie, int xpos, int ypos) {
		super();
		this.nom = nom;
		this.att = att;
		this.def = def;
		this.mvt = mvt;
		this.portee = portee;
		this.vie = vie;
		this.xpos = xpos;
		this.ypos = ypos;
		this.g = new Standard();
		empoisonne=false;
	}
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public Genre getG() {
		return g;
	}

	@Override
	public void setG(Genre g) {
		this.g = g;
	}

	@Override
	public int getAtt() {
		return att;
	}

	@Override
	public int getMvt() {
		return mvt;
	}

	@Override
	public int getDef() {
		return def;
	}

	@Override
	public int getVie() {
		return vie;
	}

	@Override
	public int getXpos() {
		return xpos;
	}

	@Override
	public int getYpos() {
		return ypos;
	}
	
	@Override
	public void deplace(int x, int y){
		int mvtmodifie=mvt;
		if(empoisonne) mvtmodifie-=2; 
		if(Math.abs(x-xpos)+Math.abs(y-ypos)<=mvtmodifie){			
			xpos=x;
			ypos=y;
			System.out.println("L'unite "+nom+" se deplace en "+xpos+", "+ypos);
		}else{
			System.out.println("L'unite "+nom+" ne peut se deplacer si loin");
		}
	}
	
	@Override
	public IAttaque attaque(int x, int y){
		if(Math.sqrt(Math.pow((xpos-x),2)+Math.pow((ypos-y),2))<=this.g.getPorteeSpe()){
			System.out.println("L'unite "+nom+" attaque et fait un maximum de "+this.g.getAttaqueSpe()+" en degats");
			return new Attaque(this.g.getAttaqueSpe(),x,y,this.g.getRayonSpe(),this.g.isPoison());
		}else{
			System.out.println("L'unite "+nom+" ne peut attaquer si loin");
			return new Attaque(0,x,y,0,false);
		}
	}
	
	@Override
	public void defendre(IAttaque a){
		System.out.println(Math.sqrt(Math.pow((a.getImpactX()-this.getXpos()),2)+ Math.pow((a.getImpactY()-this.getYpos()),2)));
		System.out.println(a.getRayon());
		if (Math.sqrt(Math.pow((a.getImpactX()-this.getXpos()),2)+ Math.pow((a.getImpactY()-this.getYpos()),2))<=a.getRayon()){
			int deg=a.getDegat()-def;
			if(deg<0) deg=0;
			if(deg>vie) deg=vie;
			vie-=deg;
			if(a.getPoison()){
				empoisonne=true;
				dureeempoisonnement=5;
			}
			System.out.println("L'unite "+nom+" se defend contre "+def+" degats");
			System.out.println("L'unite "+nom+" perd "+deg+" points de vie (il lui reste "+vie+")");
			if(empoisonne) System.out.println("L'unite "+nom+" est empoisonnee");
		}
		else {
			System.out.println("plouf");
		}
	}
	
	@Override
	public void finDeTour(){
		if(empoisonne){
			dureeempoisonnement--;
			if(dureeempoisonnement==0) empoisonne=false;
		}
	}
	
	@Override
	public void print(){
		System.out.println("Unite \t"+nom);
		System.out.println("Vie : \t"+vie);
		System.out.println("Att : \t"+g.getAttaqueSpe());
		System.out.println("Def : \t"+def);
		System.out.println("Portee : \t"+g.getPorteeSpe());
		System.out.println("Position : \t("+xpos+","+ypos+")");
		if(empoisonne) System.out.println("EMPOISSONNE");
	}
}
