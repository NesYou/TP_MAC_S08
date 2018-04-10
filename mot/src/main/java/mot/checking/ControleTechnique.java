package mot.checking;

import javafx.util.Pair;
import mot.vehiculeParts.*;

import java.util.ArrayList;
import java.util.List;

public class ControleTechnique implements IControleTechnique{

    private List<Pair<String,IGravity>> rapportControleTechnique;
    private Car car;

    public ControleTechnique(Car car) {
        this.rapportControleTechnique = new ArrayList<>();
        this.car = car;
    }

    public List<Pair<String,IGravity>> getRapportControleTechnique() {
        return this.rapportControleTechnique;
    }

    public void visit(Car car) {
        for(IMOTElement element : car.getmOTElements()) {
            element.accept(this);
        }
    }

    @Override
    public void check(Breaking breaking) {

        /* Pédale de freinage */
        if(breaking.isBreakPedalCondition()) {
            this.getRapportControleTechnique().add(new Pair<>("La pédale de freinage est défectueuse. Contre-visite visuelle nécessaire.", new Majeur(true)));
        }
        /* Plaquettes de frein (0 Avant Droit, 1 Avant Gauche, 2 Arriere Droit, 3 Arriere Gauche) */
        for(int i = 0; i < breaking.getBreakPadsCondition().length -1; i++) {
            if(breaking.getBreakPadsCondition()[i]) {
                String emplacementPlaquette = emplacement(i);
                this.getRapportControleTechnique().add(new Pair<>("La plaquette de frein "+emplacementPlaquette+" est défectueuse. Contre-visite nécessaire.", new Majeur(false)));
            }
        }
        /* Disque de frein (0 Avant Droit, 1 Avant Gauche, 2 Arriere Droit, 3 Arriere Gauche) */
        for(int i = 0; i < breaking.getBreakPadsCondition().length -1; i++) {
            if(breaking.getBreakPadsCondition()[i]) {
                String emplacementDisque = emplacement(i);
                this.getRapportControleTechnique().add(new Pair<>("Le disque de frein "+emplacementDisque+" est défectueux. Contre-visite nécessaire.", new Majeur(false)));
            }
        }

    }

    @Override
    public void check(Visibility visibility) {

    }

    @Override
    public void check(Steering steering) {

    }

    public String emplacement(int indice) {
        switch (indice) {
            case 1 : return "Avant Gauche";
            case 2 : return "Arrière Droit";
            case 3 : return "Arrière Gauche";
            default: return "Avant Droit";
        }
    }

    public String toString() {
        return "";
    }
}
