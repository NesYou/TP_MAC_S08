package race;

import attaques.AttaqueNonControlee;
import attaques.IAttaque;
import transformation.GorilleSayen;

public class Sayen implements ISayen {

    private int puissanceRelle;
    private int puissanceTheorique;

    public Sayen(int puissanceTheorique, int puissanceReelle) {
        this.puissanceTheorique = puissanceTheorique;
        this.puissanceRelle = puissanceReelle;
    }

    public AttaqueNonControlee getAttaqueNonControlee() {
        return new AttaqueNonControlee(puissanceRelle);
    }

    public GorilleSayen transformationGorille() {
        return new GorilleSayen(this);
    }

    //TODO
    public ISayen transformationSS1() {
        return null;
    }

    public void marcher() {
        System.out.println("Je marche");
    }

    public void attaquerCoupDePoing() {

    }

    public int getPuissanceTheorique() {

        return this.puissanceTheorique;

    }

    public int getPuissanceReelle() {

        return puissanceRelle;

    }


}
