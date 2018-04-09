package attaques;

public class MegaKamehamea extends AbstractAttaque {

    private static int coefficientAttaque = 100;

    public MegaKamehamea(int degat) {
        super(degat, coefficientAttaque);
    }
}
