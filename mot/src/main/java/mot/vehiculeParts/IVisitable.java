package mot.vehiculeParts;

import mot.checking.IControleTechnique;

public interface IVisitable {

    void accept(IControleTechnique controleTechnique);

}
