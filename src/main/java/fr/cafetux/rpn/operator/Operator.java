package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operand;
import fr.cafetux.rpn.Stack;


public abstract class Operator {

    Operator(){

    }

    public abstract Operand operate(Stack stack);

}
