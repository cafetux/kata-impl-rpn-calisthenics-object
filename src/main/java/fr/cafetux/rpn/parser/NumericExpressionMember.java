package fr.cafetux.rpn.parser;


public class NumericExpressionMember extends ExpressionMember {

    public NumericExpressionMember(String value) {
        super(value);
    }

    @Override
    public boolean isNumeric(){
        return true;
    }
}
