package com.dna.designPatterns.behavioral.chainOfResponsibility.staticHandlers;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {

        if ( RequestType.PURCHASE.equals(request.getRequestType()) && 1500 >= request.getAmount()) {
            System.out.println("VPs can approve purchase request up to 1500");
        } else {
            successor.handleRequest(request);
        }
    }
}
