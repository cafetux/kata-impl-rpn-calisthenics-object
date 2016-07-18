package fr.cafetux.rpn;

import static java.lang.Float.parseFloat;


public class Operande {


    private final float value;

    private Operande(float value) {
        this.value=value;
    }

    public static Operande from(String numberParsing) {
        return new Operande(parseFloat(numberParsing));
    }
    public static Operande from(float numberParsing) {
        return new Operande(numberParsing);
    }

    public Operande plus(Operande o2) {
        return new Operande(this.value+o2.value);
    }

    public Operande moins(Operande o2) {
        return new Operande(this.value-o2.value);
    }

    public Operande multiplyBy(Operande o2) {
        return new Operande(this.value*o2.value);
    }

    public Operande divideBy(Operande o2) {
        return new Operande(this.value/o2.value);
    }

    public float toFloat() {
        return value;
    }
}
