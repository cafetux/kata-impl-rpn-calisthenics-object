package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operand;
import fr.cafetux.rpn.Stack;

import static fr.cafetux.rpn.Operand.from;

public class Square implements Operator {

    public static final Square SQUARE = new Square();

    Square() {
        super();
    }

    @Override
    public Stack operate(Stack stack) {
        Operand operand1 = stack.pop();
        stack.push(from(operand1.toFloat() * operand1.toFloat()));
        return stack;
    }
}
