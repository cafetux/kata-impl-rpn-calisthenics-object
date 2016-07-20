package fr.cafetux.rpn.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Expression implements Iterable<ExpressionMember>{

    private List<ExpressionMember> members = new ArrayList<>();

    protected void add(ExpressionMember member){
        this.members.add(member);
    }


    @Override
    public Iterator<ExpressionMember> iterator() {
        return members.iterator();
    }
}
