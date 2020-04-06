package com.dna.designPatterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

import java.util.StringTokenizer;

@AllArgsConstructor
public class TerminalExpression implements Expression {

    private String data;

    @Override
    public boolean interpret(String context) {

        StringTokenizer tokenizer = new StringTokenizer(context);

        while (tokenizer.hasMoreTokens()) {
            if (tokenizer.nextToken().equals(data)) {
                return true;
            }
        }

        return false;
    }
}
