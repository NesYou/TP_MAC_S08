package states;

import context.CalculatorMemory;

public class OperandOnly implements IState {

    private CalculatorMemory context;

    public OperandOnly(CalculatorMemory context) {
        this.context = context;
    }

    public IState next(char c) {
        return new Any(this.context);
    }

}
