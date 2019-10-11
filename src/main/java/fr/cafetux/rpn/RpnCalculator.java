package fr.cafetux.rpn;

import fr.cafetux.rpn.operand.Numeric;
import fr.cafetux.rpn.operator.*;
import fr.cafetux.rpn.scanner.expression.Expression;
import fr.cafetux.rpn.scanner.expression.ExpressionMember;
import fr.cafetux.rpn.scanner.parser.SimpleParser;

import java.util.function.Predicate;
import java.util.regex.Pattern;

import static fr.cafetux.rpn.operand.Numeric.from;
import static fr.cafetux.rpn.operator.Addition.ADDITION;
import static fr.cafetux.rpn.operator.Division.DIVISION;
import static fr.cafetux.rpn.operator.Maximum.MAX;
import static fr.cafetux.rpn.operator.Multiplication.MULTIPLICATION;
import static fr.cafetux.rpn.operator.Soustraction.SOUSTRACTION;
import static fr.cafetux.rpn.operator.Square.SQUARE;

public class RpnCalculator {

    private static final Pattern NUMERIC_PATTERN = Pattern.compile("^[0-9]+$");
    private static final Predicate<String> NUMERIC = x->NUMERIC_PATTERN.matcher(x).find();

    private OperatorFactory factory = new OperatorFactory();
    private SimpleParser parser = new SimpleParser("\\s");

    {
        factory.register("+", ADDITION);
        factory.register("-", SOUSTRACTION);
        factory.register("*", MULTIPLICATION);
        factory.register("/", DIVISION);
        factory.register("SQR", SQUARE);
        factory.register("MAX", MAX);
    }

    public float resolve(String input) {

        Expression expression = parser.parse(input);
        Stack toOperate = new Stack();
        for (ExpressionMember member : expression) {
            toOperate=resolveMember(toOperate, member);
            System.out.println(toOperate);
        }
        return toOperate.getResult();
    }

    private Stack resolveMember(Stack stack, ExpressionMember member) {
        if(member.is(NUMERIC)){
			stack.push(toOperande(member));
			return stack;
        }
        Operator operator = factory.get(member.toString());
        return operator.operate(stack);
    }

    private Numeric toOperande(ExpressionMember member) {
        return from(member.toString());
    }
}
