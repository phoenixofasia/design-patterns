package com.dna.designPatterns.behavioral.interpreter;

/*
* Represents grammar
* Interpret a sentence
* Map a domain specific language
* Used in Abstract Syntax Tree (AST)
* Examples:
*   java.util.Pattern
*   java.text.Format
*
* ###   Design Considerations   ###
* Abstract Expression
* Interpret
* TerminalExpression
* NonTerminalExpression
* Components :
*   AbstractExpression, TerminalExpression, NonTerminalExpression, Client
*
* ###   Pitfalls    ###
* Complexity
* Class per rule
* Require knowledge of other patterns
* Solves specific problem
*
*
* */
public class InterpreterPatternDemo {

    public static void main(String[] args) {

//        String context = "Lions";
//        String context = "Tigers";
//        String context = "Bears";
//        String context = "Lions Tigers";
          String context = "Lions Bears";
//        String context = "Tigers Bears";

        Expression define = buildInterpreterTree();

        System.out.println( context + " is: " + define.interpret(context));
    }

    private static Expression buildInterpreterTree() {

        Expression terminal = new TerminalExpression("Lions");
        Expression termina2 = new TerminalExpression("Tigers");
        Expression termina3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(termina2, termina2);

        // Lion or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal, alternation1);

        // Bears and (Lions or (Tigers and Bears))
        return new AndExpression(termina3, alternation2);
    }
}
