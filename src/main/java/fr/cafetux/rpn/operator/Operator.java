package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operande;
import fr.cafetux.rpn.Stack;


public abstract class Operator {

    Operator(){

    }

    public abstract Operande operate(Stack stack);

}
