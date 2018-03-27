package context;

import java.util.Optional;

public class CalculatorMemory {

    private int lastResult;
    private int currentOperand;
    private char operator;

    public void operation(char c) {

    }

    public int getLastResult() {
        return this.lastResult;
    }

    public int getCurrentOperand() {
        return this.currentOperand;
    }

    public char getOperator() {
        return this.operator;
    }

    public void setLastResult(int lastResult) {
        this.lastResult = lastResult;
    }

    public void setCurrentOperand(int currentOperand) {
        this.currentOperand = currentOperand;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }


}
