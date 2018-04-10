package mot.checking;

import mot.vehiculeParts.Breaking;
import mot.vehiculeParts.Steering;
import mot.vehiculeParts.Visibility;

public interface IControleTechnique {

    void check(Breaking breaking);
    void check(Visibility visibility);
    void check(Steering steering);

}
