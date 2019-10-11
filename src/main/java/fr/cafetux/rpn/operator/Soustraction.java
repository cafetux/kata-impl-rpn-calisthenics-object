package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.operand.Operand;
import fr.cafetux.rpn.operand.OperationResult;
import fr.cafetux.rpn.Stack;

public class Soustraction implements Operator {

    public static final Soustraction SOUSTRACTION = new Soustraction();

    Soustraction(){
        super();
    }

    @Override
    public Stack operate(Stack stack) {
        Operand operand2 = stack.pop();
        Operand operand1 = stack.pop();
        stack.push(OperationResult.from(operand1.toFloat()-operand2.toFloat()));
        return stack;
    }
}
