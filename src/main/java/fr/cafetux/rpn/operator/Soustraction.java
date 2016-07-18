package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Operande;
import fr.cafetux.rpn.Stack;

public class Soustraction extends Operator {

    Soustraction(){
        super();
    }

    @Override
    public Operande operate(Stack stack) {
        Operande operande2 = stack.last();
        Operande operande1 = stack.last();
        return operande1.moins(operande2);
    }
}
