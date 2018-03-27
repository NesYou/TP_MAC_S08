package states;

public class Cancel implements IState {

    @Override
    public IState next(char c) {
        return null;
    }

}
