package fr.cafetux.rpn.scanner.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Expression implements Iterable<ExpressionMember>{

    private List<ExpressionMember> members = new ArrayList<>();

    public void add(ExpressionMember member){
        this.members.add(member);
    }

    public void add(String memberValue){
        add(new ExpressionMember(memberValue));
    }

    @Override
    public Iterator<ExpressionMember> iterator() {
        return members.iterator();
    }
}
