package fr.cafetux.rpn.parser;


public class ExpressionMember {

    private String value;

    public ExpressionMember(String value) {
        this.value = value;
    }

    public boolean isNumeric(){
        return false;
    }

    @Override
    public String toString() {
        return value;
    }
}
