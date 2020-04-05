package com.dna.designPatterns.behavioral.chainOfResponsibility.staticHandlers;

import lombok.Setter;

import java.util.Iterator;

public abstract class Handler {

    @Setter
    protected Handler successor;
    private Iterator<Handler> iterator;

    public abstract void handleRequest(Request request);
}
