package states;

public interface IState {

    IState next(char c);

}
