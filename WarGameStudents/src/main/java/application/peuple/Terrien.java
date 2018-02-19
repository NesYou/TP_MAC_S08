package application.peuple;

import application.unite.Unite;

public class Terrien implements IPeuple {

    public static final int TERRIEN_ATTAQUE = 15;
    public static final int TERRIEN_DEFENSE = 8;
    public static final int TERRIEN_MOUVEMENT = 7;
    public static final int TERRIEN_PORTEE = 10;
    public static final int TERRIEN_VIE = 30;

    @Override
    public Unite creerUnite(int id, int basex, int basey) {
        return new Unite("Soldat "+id, TERRIEN_ATTAQUE, TERRIEN_DEFENSE, TERRIEN_MOUVEMENT, TERRIEN_PORTEE, TERRIEN_VIE,basex,basey);
    }
}
