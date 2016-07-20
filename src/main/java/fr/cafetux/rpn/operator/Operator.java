package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operand;
import fr.cafetux.rpn.Stack;


public interface Operator {

    public Operand operate(Stack stack);

}
