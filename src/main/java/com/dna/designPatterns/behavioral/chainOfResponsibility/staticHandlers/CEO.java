package com.dna.designPatterns.behavioral.chainOfResponsibility.staticHandlers;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {

        if (RequestType.PURCHASE.equals(request.getRequestType()) && 1500 < request.getAmount()) {
            System.out.println("CEO need to approve purchase request above 1500");
        } else {
            successor.handleRequest(request);
        }
    }
}
