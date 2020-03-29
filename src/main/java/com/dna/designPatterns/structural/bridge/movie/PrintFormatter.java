package com.dna.designPatterns.structural.bridge.movie;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder msg = new StringBuilder();
        msg.append(header)
                .append("\n");
        details.forEach( d -> {
            msg.append(d.getLabel())
                    .append(" : ")
                    .append(d.getValue())
                    .append("\n");
        });
        return msg.toString();
    }
}
