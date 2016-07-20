package fr.cafetux.rpn.parser;


public class ExpressionMember {

    private String value;

    public ExpressionMember(String value) {
        this.value = value;
    }

    public ExpressionMember() {
        this.value="";
    }

    public void concat(String toConcat){
        value=value.concat(toConcat);
    }

    public boolean isFilled() {
        return value!=null && !value.trim().isEmpty();
    }

    public boolean isNumeric(){
        return false;
    }

    @Override
    public String toString() {
        return value;
    }
}
