package states;

import context.CalculatorMemory;

public class Any implements IState{

    private CalculatorMemory context;

    public Any(CalculatorMemory context) {
        this.context = context;
    }

    public IState next(char c) {

        if(Character.getNumericValue(c) >= 0 || Character.getNumericValue(c) <= 9) {

            return new Any(this.context);

        } else if (c == '=') {

            return new Result(this.context);

        } else if (c == '+' || c == '-' || c == '*' || c == '%') {

            return new OperandOnly(this.context);

        } else if (c == 'q'){

            return new Cancel();

        } else {

            throw new UnsupportedOperationException();

        }

    }

}
