package fr.cafetux.rpn.scanner.parser;

import fr.cafetux.rpn.scanner.expression.Expression;
import fr.cafetux.rpn.scanner.expression.ExpressionMember;

import java.util.Arrays;

/**
 * un parser simple, qui splitte selon un charactere
 */
public class SimpleParser implements Parser{

    private String separator;

    public SimpleParser(String separator){
        this.separator=separator;
    }

    @Override
    public Expression parse(String lexeme) {
        Expression expression = new Expression();
        Arrays.stream(lexeme.split(separator)).forEach(x->expression.add(new ExpressionMember(x)));
        return expression;
    }
}
