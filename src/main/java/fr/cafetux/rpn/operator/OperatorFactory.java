package fr.cafetux.rpn.operator;

import static java.lang.String.valueOf;


public class OperatorFactory {


    private static final Operator ADDITION = new Addition();
    private static final Operator SOUSTRACTION = new Soustraction();
    private static final Operator MULTIPLICATION = new Multiplication();
    private static final Operator DIVISION = new Division();

    public Operator get(String sign){

        switch (sign) {
            case "+":
                return (ADDITION);
            case "-":
                return (SOUSTRACTION);
            case "*":
                return (MULTIPLICATION);
            case "/":
                return (DIVISION);
            default:
                throw new IllegalArgumentException("invalid operator "+sign);
        }
    }

    public Operator get(char sign) {
        return get(valueOf(sign));
    }
}
