package application;

import application.genre.Genre;
import application.joueur.Joueur;
import application.unite.IUnite;

public interface IWarGame {

    IUnite creerUniter(Joueur joueur);

}
