package fr.cafetux.rpn;

import fr.cafetux.rpn.operator.*;
import fr.cafetux.rpn.parser.ExpressionMember;
import fr.cafetux.rpn.parser.RpnExpression;

import static fr.cafetux.rpn.operator.Addition.ADDITION;
import static fr.cafetux.rpn.operator.Division.DIVISION;
import static fr.cafetux.rpn.operator.Multiplication.MULTIPLICATION;
import static fr.cafetux.rpn.operator.Soustraction.SOUSTRACTION;
import static fr.cafetux.rpn.operator.Square.SQUARE;

public class RpnCalculator {

    private OperatorFactory factory = new OperatorFactory();
    {
        factory.register("+", ADDITION);
        factory.register("-", SOUSTRACTION);
        factory.register("*", MULTIPLICATION);
        factory.register("/", DIVISION);
        factory.register("²", SQUARE);
    }

    public float resolve(String input) {

        RpnExpression expression = new RpnExpression(input);
        Stack toOperate = new Stack();

        for (ExpressionMember member : expression) {
            toOperate=resolveMember(toOperate, member);
        }
        return toOperate.unique();
    }

    private Stack resolveMember(Stack toOperate, ExpressionMember member) {
        if(member.isNumeric()){
           toOperate.push(toOperande(member));
            return toOperate;
        }
        Operator operator = factory.get(member.toString());
        return operator.operate(toOperate);
    }

    private Operand toOperande(ExpressionMember member) {
        return Operand.from(member.toString());
    }
}
