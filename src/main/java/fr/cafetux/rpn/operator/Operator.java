package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.Stack;


public interface Operator {

    Stack operate(Stack stack);

}
