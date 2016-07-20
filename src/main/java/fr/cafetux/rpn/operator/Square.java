package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operande;
import fr.cafetux.rpn.Stack;

public class Square extends Operator {

    Square() {
        super();
    }

    @Override
    public Operande operate(Stack stack) {
        Operande operande1 = stack.pop();
        return Operande.from(operande1.toFloat()*operande1.toFloat());
    }
}
