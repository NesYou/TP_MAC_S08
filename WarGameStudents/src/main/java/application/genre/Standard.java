package application.genre;

import application.Attaque;
import application.IAttaque;

public class Standard extends Genre {

    private static final int PORTEE_STANDARD = 10;

    public Standard() {
        this.setAttaqueSpe(this.getAttaqueSpe());
        this.setPorteeSpe(PORTEE_STANDARD);
        this.setRayonSpe(this.getRayonSpe());
        this.setPoison(false);
    }

    @Override
    public IAttaque attaque(int attaqueSpe, int x, int y, int rayonSpe) {
        return new Attaque(attaqueSpe,x,y,rayonSpe,false);
    }

}