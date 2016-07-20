package fr.cafetux.rpn;

import fr.cafetux.rpn.operator.Operator;
import fr.cafetux.rpn.operator.OperatorFactory;
import fr.cafetux.rpn.parser.ExpressionMember;
import fr.cafetux.rpn.parser.RpnExpression;

public class RpnCalculator {

    private OperatorFactory factory = new OperatorFactory();

    public float resolve(String input) {

        RpnExpression expression = new RpnExpression(input);
        Stack toOperate = new Stack();

        for (ExpressionMember member : expression) {
            resolveMember(toOperate, member);
        }
        return toOperate.unique();
    }

    private void resolveMember(Stack toOperate, ExpressionMember member) {
        if(member.isNumeric()){
           toOperate.push(toOperande(member));
            return;
        }
        Operator operator = factory.get(member.value());
        Operand result = operator.operate(toOperate);
        toOperate.push(result);
    }

    private Operand toOperande(ExpressionMember member) {
        return Operand.from(member.value());
    }
}
