package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operand;
import fr.cafetux.rpn.Stack;


public class Multiplication extends Operator {

    Multiplication() {
        super();
    }

    public Operand operate(Stack stack) {
        Operand operand2 = stack.pop();
        Operand operand1 = stack.pop();
        return operand1.multiplyBy(operand2);
    }
}
