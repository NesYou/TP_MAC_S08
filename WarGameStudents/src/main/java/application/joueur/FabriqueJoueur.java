package application.joueur;

import application.peuple.Martien;
import application.peuple.Terrien;

public class FabriqueJoueur implements IFabriqueJoueur {

    @Override
    public Joueur creerJoueur(int peuple, String nom, int basex, int basey) {
        switch (peuple) {
            case 1:
                return creerJoueurMartien(nom, basex, basey);
            case 2:
                return creerJoueurTerrien(nom, basex, basey);
            default:
                return creerJoueurMartien(nom, basex, basey);
        }
    }

    @Override
    public Joueur creerJoueurMartien(String nom, int basex, int basey) {
        return new Joueur(nom,new Martien(),basex,basey);
    }

    @Override
    public Joueur creerJoueurTerrien(String nom, int basex, int basey) {
        return new Joueur(nom,new Terrien(),basex,basey);
    }
}
