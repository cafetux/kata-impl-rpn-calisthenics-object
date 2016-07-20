package fr.cafetux.rpn.operator;

import java.util.HashMap;
import java.util.Map;

import static java.util.Optional.ofNullable;

public class OperatorFactory {

    private Map<String,Operator> operators = new HashMap<>();

    public Operator get(String sign){
        return ofNullable(operators.get(sign))
                .orElseThrow(()->new IllegalArgumentException("invalid operator "+sign));
    }

    public void register(String operator,Operator implementation){
        operators.put(operator,implementation);
    }
}
