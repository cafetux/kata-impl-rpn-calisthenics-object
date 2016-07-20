package fr.cafetux.rpn.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Une expression de type RPN (reverse polish notation)
 */
public class RpnExpression extends Expression {

    private Pattern numberPattern = Pattern.compile("^[0-9]+$");

    public RpnExpression(String expression) {
        for (String character : expression.split("\\s")) {
            readCharacter(character);
        }
    }

    private void readCharacter(String character) {
        Matcher matcher = numberPattern.matcher(character);
        if (matcher.find()) {
            add(new NumericExpressionMember(character));
            return;
        }
        add(new ExpressionMember(character));
    }

}
