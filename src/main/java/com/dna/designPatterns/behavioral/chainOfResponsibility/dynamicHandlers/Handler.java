package com.dna.designPatterns.behavioral.chainOfResponsibility.dynamicHandlers;

import java.util.Iterator;
import java.util.List;

public abstract class Handler {

    protected static List<Handler> handlers;
    private Iterator<Handler> iterator;

    protected void doFilter(Request request) {

        if(iterator == null) {
            iterator = handlers.iterator();
        }
        if(iterator.hasNext()){
            iterator.next().handleRequest(request);
        }

    }

    public static void registerHandlers(List<Handler> handlers) {
        Handler.handlers = handlers;
    }

    public abstract void handleRequest(Request request);
}
