package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operand;
import fr.cafetux.rpn.Stack;


public class Multiplication implements Operator {

    public static final Multiplication MULTIPLICATION = new Multiplication();

    Multiplication() {
        super();
    }

    public Stack operate(Stack stack) {
        Operand operand2 = stack.pop();
        Operand operand1 = stack.pop();
        stack.push(operand1.multiplyBy(operand2));
        return stack;
    }
}
