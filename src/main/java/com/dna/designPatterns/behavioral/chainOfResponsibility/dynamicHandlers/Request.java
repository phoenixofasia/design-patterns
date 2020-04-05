package com.dna.designPatterns.behavioral.chainOfResponsibility.dynamicHandlers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Request {

    private RequestType requestType;
    private double amount;

}
