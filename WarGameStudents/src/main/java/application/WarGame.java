package application;

import application.joueur.Joueur;

public class WarGame implements IWarGame{

    private Joueur[] joueurs = new Joueur[2];

    @Override
    public String getNomJoueur(Joueur joueur) {
        return joueur.getNom();
    }
}
