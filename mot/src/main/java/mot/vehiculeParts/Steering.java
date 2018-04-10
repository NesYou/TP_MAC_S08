package mot.vehiculeParts;

public class Steering implements IMOTElement {

    /**
     * Volant
     */
    private boolean whileCondition;

    /**
     * Cremaillère
     */
    private boolean rackCondition;

    /**
     * Antivol
     */
    private boolean wheelLock;

    public Steering(boolean whileCondition, boolean rackCondition, boolean wheelLock) {
        this.whileCondition = whileCondition;
        this.rackCondition = rackCondition;
        this.wheelLock = wheelLock;
    }

    public boolean isWhileCondition() {
        return whileCondition;
    }

    public boolean isRackCondition() {
        return rackCondition;
    }

    public boolean isWheelLock() {
        return wheelLock;
    }

}
