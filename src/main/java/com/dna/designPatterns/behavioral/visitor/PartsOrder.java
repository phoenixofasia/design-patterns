package com.dna.designPatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {

        parts.forEach( part -> part.accept(visitor));
        visitor.visit(this);
    }
}
