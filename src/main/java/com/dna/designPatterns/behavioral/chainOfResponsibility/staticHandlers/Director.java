package com.dna.designPatterns.behavioral.chainOfResponsibility.staticHandlers;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (RequestType.CONFERENCE.equals(request.getRequestType())) {
            System.out.println("Director can approve conferences");
        } else {
            throw new IllegalArgumentException("Invalid request");
        }
    }
}
