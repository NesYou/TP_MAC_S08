package application.joueur;

public interface IFabriqueJoueur {

    Joueur creerJoueur(int peuple, String nom, int basex, int basey);
    Joueur creerJoueurMartien(String nom, int basex, int basey);
    Joueur creerJoueurTerrien(String nom, int basex, int basey);

}
