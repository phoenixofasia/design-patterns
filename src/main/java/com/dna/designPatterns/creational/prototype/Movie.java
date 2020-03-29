package com.dna.designPatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Movie extends Item {

    private String runTime;

    @Override
    public String toString() {
        return "Movie{" +
                "runTime='" + runTime + '\'' +
                "} " + super.toString();
    }


}
