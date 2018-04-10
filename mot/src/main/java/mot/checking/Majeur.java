package mot.checking;

public class Majeur implements IGravity{

    private boolean contreVisiteVisuelle;

    public Majeur(boolean contreVisiteVisuelle) {
        this.contreVisiteVisuelle = contreVisiteVisuelle;
    }

    public boolean isContreVisiteVisuelle() {
        return this.contreVisiteVisuelle;
    }

}
