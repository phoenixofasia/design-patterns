package com.dna.designPatterns.structural.bridge.movie;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class MoviePrinter extends Printer {

    private Movie movie;

    @Override
    protected List<Detail> getDetails() {
        List details = new ArrayList(3);
        details.add(new Detail("Name", movie.getTitle()));
        details.add(new Detail("Duration", movie.getRuntime()));
        details.add(new Detail("Released", movie.getYear()));
        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
