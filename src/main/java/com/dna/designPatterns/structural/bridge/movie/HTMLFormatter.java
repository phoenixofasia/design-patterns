package com.dna.designPatterns.structural.bridge.movie;

import java.util.List;

public class HTMLFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder msg = new StringBuilder();

        msg.append("<h1>")
                .append(header)
                .append("</h1>");
        details.forEach( d -> {
            msg.append(d.getLabel())
                    .append(" : ")
                    .append(d.getValue())
                    .append("<br>");
        });

        return msg.toString();
    }
}
