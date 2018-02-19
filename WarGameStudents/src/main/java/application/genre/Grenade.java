package application.genre;

import application.attaque.Attaque;
import application.attaque.IAttaque;

public class Grenade extends Genre{

    private static final int ATTAQUE_GRENADE = 5;
    private static final int PORTEE_GRENADE = -3;
    private static final int RAYON_GRENADE = 20;

    public Grenade(int attaque, int portee) {
        this.setAttaqueSpe(attaque + ATTAQUE_GRENADE);
        this.setPorteeSpe(portee + PORTEE_GRENADE);
        this.setRayonSpe(RAYON_GRENADE);
        this.setPoison(false);
    }

    @Override
    public IAttaque attaque(int attaqueSpe, int x, int y, int rayonSpe) {
        return new Attaque(attaqueSpe,x,y,rayonSpe,false);
    }

}
