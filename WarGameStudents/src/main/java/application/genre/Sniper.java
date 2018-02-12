package application.genre;

import application.Attaque;
import application.IAttaque;

public class Sniper extends Genre {

    private static final int ATTAQUE_SNIPER = -5;
    private static final int PORTEE_SNIPER = 3;
    private static final int RAYON_SNIPER = 1;

    public Sniper() {
        this.setAttaqueSpe(this.getAttaqueSpe() + ATTAQUE_SNIPER);
        this.setPorteeSpe(this.getPorteeSpe() + PORTEE_SNIPER);
        this.setRayonSpe(RAYON_SNIPER);
        this.setPoison(false);
    }

    @Override
    public IAttaque attaque(int attaqueSpe, int x, int y, int rayonSpe) {
        return new Attaque(attaqueSpe,x,y,rayonSpe,false);
    }
}
