package application.peuple;

import application.Unite;

public class Martien implements IPeuple {

    public static final int MARTIEN_ATTAQUE = 20;
    public static final int MARTIEN_DEFENSE = 5;
    public static final int MARTIEN_MOUVEMENT = 10;
    public static final int MARTIEN_PORTEE = 15;
    public static final int MARTIEN_VIE = 25;

    @Override
    public Unite creerUnite(int id, int basex, int basey) {
        return new Unite("Soldat "+id, MARTIEN_ATTAQUE, MARTIEN_DEFENSE, MARTIEN_MOUVEMENT, MARTIEN_PORTEE, MARTIEN_VIE,basex,basey);
    }
}
