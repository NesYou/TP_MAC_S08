package mot.vehiculeParts;

import mot.checking.IControleTechnique;

import java.util.List;

public interface IMOTElement extends IVisitable {

    void accept(IControleTechnique checkeur);

}
