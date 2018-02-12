package application.genre;

import application.Attaque;
import application.IAttaque;

public class Grenade extends Genre{

    private static final int ATTAQUE_GRENADE = 5;
    private static final int PORTEE_GRENADE = -3;
    private static final int RAYON_GRENADE = 20;

    public Grenade() {
        this.setAttaqueSpe(this.getAttaqueSpe() + ATTAQUE_GRENADE);
        this.setPorteeSpe(this.getPorteeSpe() + PORTEE_GRENADE);
        this.setRayonSpe(RAYON_GRENADE);
        this.setPoison(false);
    }

    @Override
    public IAttaque attaque(int attaqueSpe, int x, int y, int rayonSpe) {
        return new Attaque(attaqueSpe,x,y,rayonSpe,false);
    }

}
