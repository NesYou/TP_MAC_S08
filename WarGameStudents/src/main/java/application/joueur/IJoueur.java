package application.joueur;

import application.unite.IUnite;
import application.attaque.IAttaque;
import application.genre.Genre;

import java.util.Collection;

public interface IJoueur {
    Collection<IUnite> getArmee();

    String getNom();

    IUnite creerUnite();

    void changerTypeUnite(String nom, Genre g);

    void deplacer(String nom, int x, int y);

    void defendre(IAttaque a);

    IAttaque attaquer(String nom, int x, int y);

    void finDeTour();

    public enum Peuple{TERRIEN,MARTIEN}
}
