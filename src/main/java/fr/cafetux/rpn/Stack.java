package fr.cafetux.rpn;

import fr.cafetux.rpn.operand.Numeric;
import fr.cafetux.rpn.operand.Operand;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class Stack {

    private Deque<Operand> stack = new ArrayDeque<>();

    public void push(Operand operand){
        stack.addLast(operand);
    }

    public Operand pop(){
        return Optional.ofNullable(stack.pollLast()).orElse(Numeric.from(0));
    }

    public float getResult() {
        if(stack.size()>1){
            throw new IllegalStateException("incomplete calcul, missing resolutions");
        }
        return getFirst().toFloat();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    private Operand getFirst() {
        return stack.getFirst();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }
}
