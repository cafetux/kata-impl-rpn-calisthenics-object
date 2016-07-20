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

        for (ExpressionMember member : expression.forEach()) {
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
        Operande result = operator.operate(toOperate);
        toOperate.push(result);
    }

    private Operande toOperande(ExpressionMember member) {
        return Operande.from(member.value());
    }
}
