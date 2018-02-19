package application.genre;

import application.attaque.Attaque;
import application.attaque.IAttaque;

public class Standard extends Genre {

    private static final int PORTEE_STANDARD = 10;

    public Standard(int attaque) {
        this.setAttaqueSpe(attaque);
        this.setPorteeSpe(PORTEE_STANDARD);
        this.setRayonSpe(this.getRayonSpe());
        this.setPoison(false);
    }

    @Override
    public IAttaque attaque(int attaqueSpe, int x, int y, int rayonSpe) {
        return new Attaque(attaqueSpe,x,y,rayonSpe,false);
    }

}