package fr.cafetux.rpn;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

    private Deque<Operand> stack = new ArrayDeque<>();

    public void push(Operand operand){
        stack.addLast(operand);
    }

    public Operand pop(){
        return stack.pollLast();
    }

    public float unique() {
        if(stack.size()>1){
            throw new IllegalStateException("incomplete calcul, missing resolutions");
        }
        return getFirst().toFloat();
    }

    private Operand getFirst() {
        return stack.getFirst();
    }
}
