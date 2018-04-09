package race;

import attaques.AttaqueNonControlee;
import transformation.GorilleSayen;

public interface ISayen extends Humain  {

    GorilleSayen transformationGorille();
    ISayen transformationSS1();
    AttaqueNonControlee getAttaqueNonControlee();

    int getPuissanceTheorique();
    int getPuissanceReelle();

}
