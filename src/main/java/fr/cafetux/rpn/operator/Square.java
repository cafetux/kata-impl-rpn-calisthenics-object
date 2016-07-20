package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operand;
import fr.cafetux.rpn.Stack;

public class Square implements Operator {

    Square() {
        super();
    }

    @Override
    public Operand operate(Stack stack) {
        Operand operand1 = stack.pop();
        return Operand.from(operand1.toFloat() * operand1.toFloat());
    }
}
