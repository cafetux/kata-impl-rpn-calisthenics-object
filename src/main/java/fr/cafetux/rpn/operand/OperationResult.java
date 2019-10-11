package fr.cafetux.rpn.operand;

import static java.lang.Float.parseFloat;


public class OperationResult implements Operand {


    private final float value;

    private OperationResult(float value) {
        this.value=value;
    }

    public static OperationResult from(String numberParsing) {
        return new OperationResult(parseFloat(numberParsing));
    }
    public static OperationResult from(float numberParsing) {
        return new OperationResult(numberParsing);
    }

    @Override
    public float toFloat() {
        return value;
    }

    @Override
    public String toString() {
        return "OperationResult{" +
                "value=" + value +
                '}';
    }
}
