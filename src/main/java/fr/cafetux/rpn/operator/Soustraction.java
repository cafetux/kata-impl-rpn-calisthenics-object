package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operand;
import fr.cafetux.rpn.Stack;

public class Soustraction implements Operator {

    Soustraction(){
        super();
    }

    @Override
    public Operand operate(Stack stack) {
        Operand operand2 = stack.pop();
        Operand operand1 = stack.pop();
        return operand1.moins(operand2);
    }
}
