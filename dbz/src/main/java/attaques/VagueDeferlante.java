package attaques;

public class VagueDeferlante extends AbstractAttaque {

    private static int coefficientAttaque = 2;


    public VagueDeferlante(int degat) {
        super(degat, coefficientAttaque);
    }
}
