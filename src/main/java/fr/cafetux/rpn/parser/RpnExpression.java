package fr.cafetux.rpn.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Une expression de type RPN (reverse polish notation)
 */
public class RpnExpression extends Expression {

    private Pattern numberPattern = Pattern.compile("^[0-9]$");
    private ExpressionMember current;

    public RpnExpression(String expression) {
        current = new NumericExpressionMember();
        for (String character : expression.split("")) {
            readCharacter(character);
        }
    }

    private void readCharacter(String character) {
        Matcher matcher = numberPattern.matcher(character);
        if(character.equals(" ")){
            current = addNumericExpressionMember(current);
            return;
        }
        if (matcher.find()) {
            current.concat(character);
            return;
        }
        current = addNumericExpressionMember(current);
        add(new ExpressionMember(character));
    }

    private ExpressionMember addNumericExpressionMember(ExpressionMember current) {
        if(current.isFilled()) {
            add(current);
            current = new NumericExpressionMember();
        }
        return current;
    }
}
