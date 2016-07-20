package fr.cafetux.rpn.scanner.expression;



import java.util.function.Predicate;

public class ExpressionMember {

    private String value;

    public ExpressionMember(String value) {
        this.value = value;
    }

    public boolean is(Predicate<String> predicate){
        return predicate.test(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
