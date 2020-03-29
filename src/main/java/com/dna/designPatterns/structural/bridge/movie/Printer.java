package com.dna.designPatterns.structural.bridge.movie;

import java.util.List;

public abstract class Printer {

    public void print(Formatter formatter) {
        System.out.println(formatter.format(getHeader(), getDetails()));
    }

    protected abstract List<Detail> getDetails();

    protected abstract String getHeader();
}
