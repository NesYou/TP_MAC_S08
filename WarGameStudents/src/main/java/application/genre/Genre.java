package application.genre;

import application.Attaque;
import application.IAttaque;

public abstract class Genre implements IGenre {

    private int attaqueSpe;
    private int porteeSpe;
    private int rayonSpe;
    private boolean poison;



    @Override
    public int getAttaqueSpe() {
        return attaqueSpe;
    }

    @Override
    public void setAttaqueSpe(int attaqueSpe) {
        this.attaqueSpe = attaqueSpe;
    }

    @Override
    public int getPorteeSpe() {
        return porteeSpe;
    }

    @Override
    public void setPorteeSpe(int porteeSpe) {
        this.porteeSpe = porteeSpe;
    }

    @Override
    public int getRayonSpe() {
        return rayonSpe;
    }

    @Override
    public void setRayonSpe(int rayonSpe) {
        this.rayonSpe = rayonSpe;
    }

    @Override
    public boolean isPoison() {
        return this.poison;
    }

    @Override
    public void setPoison(boolean poison) {
        this.poison = poison;
    }
}
