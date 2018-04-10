package mot.vehiculeParts;

import mot.checking.IControleTechnique;

import java.util.List;

public class Breaking implements IVisitable {

    /**
     * Pédale de freinage
     */
    private boolean breakPedalCondition;

    /**
     * Plaquettes de frein (0 Avant Droit, 1 Avant Gauche, 2 Arriere Droit, 3 Arriere Gauche)
     */
    private boolean[] breakPadsCondition;


    /**
     * Disque de frein (0 Avant Droit, 1 Avant Gauche, 2 Arriere Droit, 3 Arriere Gauche)
     */
    private boolean[] breakDisksCondition;

    public Breaking(boolean breakPedalCondition, boolean[] breakPadsCondition, boolean[] breakDisksCondition) {
        this.breakPedalCondition = breakPedalCondition;
        this.breakPadsCondition = breakPadsCondition;
        this.breakDisksCondition = breakDisksCondition;
    }

    public boolean isBreakPedalCondition() {
        return breakPedalCondition;
    }

    public boolean[] getBreakPadsCondition() {
        return breakPadsCondition;
    }

    public boolean[] getBreakDisksCondition() {
        return breakDisksCondition;
    }

    @Override
    public void accept(IControleTechnique controleTechnique) {
        controleTechnique.check(this);
    }
}
