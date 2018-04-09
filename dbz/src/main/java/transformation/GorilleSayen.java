package transformation;

import race.ISayen;

public class GorilleSayen extends SayenTransforme {

    public GorilleSayen(ISayen sayen) {
        super(sayen);
    }

    @Override
    public int getPuissanceReelle() {
        return getSayen().getPuissanceReelle() * 10;
    }

}
