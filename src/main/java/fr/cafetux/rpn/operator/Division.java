package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operande;
import fr.cafetux.rpn.Stack;

public class Division extends Operator {

    Division() {
        super();
    }

    @Override
    public Operande operate(Stack stack) {
        Operande operande2 = stack.pop();
        Operande operande1 = stack.pop();
        return operande1.divideBy(operande2);
    }
}
