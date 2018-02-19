package application.unite;

import application.attaque.IAttaque;
import application.genre.Genre;

public interface IUnite {
    String getNom();

    Genre getG();

    void setG(Genre g);

    int getAtt();

    int getMvt();

    int getDef();

    int getVie();

    int getXpos();

    int getYpos();

    int getPortee();

    void deplace(int x, int y);

    IAttaque attaque(int x, int y);

    void defendre(IAttaque a);

    void finDeTour();

    void print();
}
