package com.dna.designPatterns.structural.bridge.movie;

public class MovieBridgePatternDemo {

    public static void main(String[] args) {

        Movie movie = new Movie("Action", "The Last Air Bender", "1:40", "2017");

        Printer printer = new MoviePrinter(movie);
        printer.print(new PrintFormatter());
        printer.print(new HTMLFormatter());
    }
}
