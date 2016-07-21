package fr.cafetux.rpn;

import static java.lang.Float.parseFloat;


public class Operand {


    private final float value;

    private Operand(float value) {
        this.value=value;
    }

    public static Operand from(String numberParsing) {
        return new Operand(parseFloat(numberParsing));
    }
    public static Operand from(float numberParsing) {
        return new Operand(numberParsing);
    }

    public float toFloat() {
        return value;
    }
}
