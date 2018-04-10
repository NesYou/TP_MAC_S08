package mot.vehiculeParts;

import mot.checking.IControleTechnique;

import java.util.ArrayList;

public class Car implements IVisitable {

    /**
     * Liste des éléments vérifiés
     */
    private ArrayList<IMOTElement> mOTElements;

    public Car(ArrayList<IMOTElement> mOTElements) {
        this.mOTElements = mOTElements;
    }

    public ArrayList<IMOTElement> getmOTElements() {
        return mOTElements;
    }

    @Override
    public void accept(IControleTechnique controleTechnique) {
        
    }
}
