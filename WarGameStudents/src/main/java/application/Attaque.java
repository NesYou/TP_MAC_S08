package application;

public class Attaque implements IAttaque {
	int degat;
	boolean poison;
	int impactX;
	int impactY;
	int rayon;
	@Override
    public int getImpactY() {
		return impactY;
	}
	@Override
    public int getRayon() {
		return rayon;
	}
	public Attaque(int degat,int x,int y, int rayon, boolean poison) {
		super();
		this.impactX=x;
		this.impactY=y;
		this.degat = degat;
		this.poison = poison;
		this.rayon = rayon;
	}
	@Override
    public int getDegat() {
		return degat;
	}
	@Override
    public boolean getPoison() {
		return poison;
	}
	@Override
    public int getImpactX() {
		// TODO Auto-generated method stub
		return impactX;
	}
}
