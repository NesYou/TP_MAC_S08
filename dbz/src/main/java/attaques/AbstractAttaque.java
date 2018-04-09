package attaques;

public abstract class AbstractAttaque implements IAttaque {

    protected int degat;
    protected int coefficientAttaque;

    public AbstractAttaque(int degat, int coefficientAttaque) {
        this.degat = degat;
        this.coefficientAttaque = coefficientAttaque;
    }

    public int getDegats() {
        return this.degat * this.coefficientAttaque;
    }

    public int getCoefficientAttaque() {
        return this.coefficientAttaque;
    }

}
