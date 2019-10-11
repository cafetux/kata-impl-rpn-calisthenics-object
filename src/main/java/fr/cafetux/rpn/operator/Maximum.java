package fr.cafetux.rpn.operator;

import fr.cafetux.rpn.operand.Operand;
import fr.cafetux.rpn.operand.OperationResult;
import fr.cafetux.rpn.Stack;

/**
 * Je pense que l'opérateur MAX (tel qu'énoncé) s'éloigne de la philosophie de la RPN.
 * C'est pour cela que j'ai préfèré utiliser un "instance of" ici au lieu de modifier l'extérieur de cet opérateur pour en gérer la problématique,
 * au léger détriment de LSP.
 *
 */
public class Maximum implements Operator {

    public static final Maximum MAX = new Maximum();

    Maximum() {
        super();
    }

    @Override
    public Stack operate(Stack stack) {
        float tmp = 0;

        while(!stack.isEmpty()) {
            Operand pop = stack.pop();
            if(pop instanceof OperationResult){
                stack.push(pop);
                break;
            }
            if(pop.toFloat() > tmp) {
                tmp = pop.toFloat();
            }
        }
        stack.push(OperationResult.from(tmp));
        return stack;
    }
}
