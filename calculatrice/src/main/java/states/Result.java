package states;

import context.CalculatorMemory;

public class Result implements IState {

    private CalculatorMemory context;

    public Result(CalculatorMemory context) {
        this.context = context;
    }

    @Override
    public IState next(char c) {
        return new OperandOnly(this.context);
    }
}
