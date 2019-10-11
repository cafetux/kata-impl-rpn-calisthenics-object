package fr.cafetux.rpn.operand;

import static java.lang.Float.parseFloat;


public class Numeric implements Operand {


    private final float value;

    private Numeric(float value) {
        this.value=value;
    }

    public static Numeric from(String numberParsing) {
        return new Numeric(parseFloat(numberParsing));
    }
    public static Numeric from(float numberParsing) {
        return new Numeric(numberParsing);
    }

    @Override
    public float toFloat() {
        return value;
    }

    @Override
    public String toString() {
        return "Numeric{" +
                "value=" + value +
                '}';
    }

}
