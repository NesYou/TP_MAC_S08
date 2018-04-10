package transformation;

import attaques.AttaqueNonControlee;
import attaques.VagueDeferlante;
import race.ISayen;

public abstract class SayenTransforme implements ITransformation {

    protected ISayen sayen;

    public SayenTransforme(ISayen sayen) {
        this.sayen = sayen;
    }

    ISayen getSayen() {
        return this.sayen;
    }

    public int getPuissanceTheorique() {
        return this.sayen.getPuissanceTheorique();
    }

    public int getPuissanceReelle() {
        return this.sayen.getPuissanceReelle();
    }

    public GorilleSayen transformationGorille() {
        return this.sayen.transformationGorille();
    }

    //TODO
    public ISayen transformationSS1() {

        return null;
    }

    public AttaqueNonControlee getAttaqueNonControlee() {

        return new AttaqueNonControlee(getPuissanceReelle());

    }

    public VagueDeferlante creerVagueDeferlante() {

        return new VagueDeferlante(getPuissanceReelle());

    }

    public void attaquerCoupDePoing() {

    }

    public void voler() {

        System.out.println("Je vole !");

    }

    public void marcher() {

        System.out.println("Je marche !");

    }

}
