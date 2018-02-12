package application;

import application.genre.Genre;
import application.peuple.IPeuple;

import java.util.ArrayList;
import java.util.Collection;


public class Joueur implements IJoueur {

	String nom;
	Collection<IUnite> armee;
	int basex,basey;

	private IPeuple p;
	
	static int id=0;

	@Override
	public Collection<IUnite> getArmee() {
		return armee;
	}

	public Joueur(String nom, IPeuple p, int basex, int basey) {
		super();
		this.nom = nom;
		this.p = p;
		this.basex = basex;
		this.basey = basey;
		armee=new ArrayList<IUnite>();
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public IUnite creerUnite(){
		IUnite u;
		id++;
		u = p.creerUnite(id,basex,basey);
		armee.add(u);
		System.out.println("Unite formee par "+nom+" : ");
		u.print();
		return u;
	}
	
	@Override
	public void changerTypeUnite(String nom, Genre g){
		for(IUnite e:armee)
			if(e.getNom().equals(nom))
				e.setG(g);
	}
	
	@Override
	public void deplacer(String nom, int x, int y){
		for(IUnite e:armee)
			if(e.getNom().equals(nom))
				e.deplace(x, y);
	}
	
	
	
	@Override
	public void defendre(IAttaque a){
		for(IUnite e:armee) {
			e.defendre(a);
		}
	}
	
	@Override
	public IAttaque attaquer(String nom, int x, int y){
		for(IUnite e:armee)
			if(e.getNom().equals(nom))
				return e.attaque(x, y);
		return new Attaque(0,x,y,0, false);
	}
	
	@Override
	public void finDeTour(){
		for(IUnite e:armee){
			e.print();
			e.finDeTour();
		}
	}
}
