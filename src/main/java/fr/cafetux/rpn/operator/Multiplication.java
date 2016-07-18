package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operande;
import fr.cafetux.rpn.Stack;


public class Multiplication extends Operator {

    Multiplication() {
        super();
    }

    public Operande operate(Stack stack) {
        Operande operande2 = stack.last();
        Operande operande1 = stack.last();
        return operande1.multiplyBy(operande2);
    }
}
