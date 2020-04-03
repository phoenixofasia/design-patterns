package com.dna.designPatterns.structural.proxy;

public interface PostService {
    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);
}
