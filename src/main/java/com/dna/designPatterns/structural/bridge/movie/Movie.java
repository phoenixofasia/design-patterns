package com.dna.designPatterns.structural.bridge.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {

    private String classification;
    private String title;
    private String runtime;
    private String year;
}
