package com.dna.designPatterns.structural.proxy;

public class PostServiceStub implements PostService {

    @Override
    public String getTimeline(String screenName) {
        return "My " + screenName + " Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("@" + screenName + " : " + message);
    }
}
