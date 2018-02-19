package application.genre;

import application.attaque.IAttaque;

public interface IGenre {

    int getAttaqueSpe();
    int getPorteeSpe();
    int getRayonSpe();
    boolean isPoison();

    void setAttaqueSpe(int attaqueSpe);
    void setPorteeSpe(int porteeSpe);
    void setRayonSpe(int rayonSpe);
    void setPoison(boolean poison);

    IAttaque attaque(int attaqueSpe, int x, int y, int rayonSpe);

}
