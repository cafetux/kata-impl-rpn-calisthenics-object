package fr.cafetux.rpn.scanner.parser;

import fr.cafetux.rpn.scanner.expression.Expression;


/**
 * Permet de transformer une string en expression
 */
public interface Parser {

    Expression parse(String lexeme);

}
