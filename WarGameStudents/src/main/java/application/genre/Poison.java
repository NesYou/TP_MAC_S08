package application.genre;

import application.attaque.Attaque;
import application.attaque.IAttaque;

public class Poison extends Genre {

    private static final int ATTAQUE_POISON = -5;
    private static final int PORTEE_POISON = -3;
    private static final int RAYON_POISON = 50;

    public Poison(int attaque, int portee) {
        this.setAttaqueSpe(attaque + ATTAQUE_POISON);
        this.setPorteeSpe(portee + PORTEE_POISON);
        this.setRayonSpe(RAYON_POISON);
        this.setPoison(true);
    }

    @Override
    public IAttaque attaque(int attaqueSpe, int x, int y, int rayonSpe) {
        return new Attaque(attaqueSpe,x,y,rayonSpe,true);
    }

}
