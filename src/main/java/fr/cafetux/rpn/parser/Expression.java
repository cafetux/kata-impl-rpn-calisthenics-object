package fr.cafetux.rpn.parser;

import java.util.ArrayList;
import java.util.List;


public class Expression {

    private List<ExpressionMember> members = new ArrayList<>();

    protected void add(ExpressionMember member){
        this.members.add(member);
    }

    public List<ExpressionMember> forEach() {
        return members;
    }
}
