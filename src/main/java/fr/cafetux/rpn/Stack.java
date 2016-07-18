package fr.cafetux.rpn;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

    private Deque<Operande> stack = new ArrayDeque<>();

    public void pop(Operande operande){
        stack.addLast(operande);
    }

    public Operande last(){
        return stack.pollLast();
    }

    public float unique() {
        if(stack.size()>1){
            throw new IllegalStateException("incomplete calcul, missing resolutions");
        }
        return getFirst().toFloat();
    }

    private Operande getFirst() {
        return stack.getFirst();
    }
}