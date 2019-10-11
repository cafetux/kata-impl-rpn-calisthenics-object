package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.operand.Operand;
import fr.cafetux.rpn.Stack;

import static fr.cafetux.rpn.operand.OperationResult.from;

public class Addition implements Operator {

    public static final Addition ADDITION = new Addition();

    Addition() {
        super();
    }

    @Override
    public Stack operate(Stack stack) {
        Operand operand2 = stack.pop();
        Operand operand1 = stack.pop();
        stack.push(from(operand1.toFloat() + operand2.toFloat()));
        return stack;
    }
}
