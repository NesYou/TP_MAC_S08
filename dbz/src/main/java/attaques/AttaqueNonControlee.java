package attaques;

public class AttaqueNonControlee extends AbstractAttaque {

    private static int coefficientAttaque = 1;

    public AttaqueNonControlee(int degat) {
        super(degat, coefficientAttaque);
    }

}
