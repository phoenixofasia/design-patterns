package com.dna.designPatterns.structural.facade;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/*
*
* Make an API easier to use
* Reduce dependencies on outside code
* Simplify the interface or client usage
* Usually a refactoring pattern
* Example
*   java.net.URL
*   javax.faces.context.FacesContext
*
* ###   Design Considerations   ###
* Class that utilizes composition
* Shouldn't have a need for composition
* Typically encompasses full lifecycle
* */
public class FacadePatternDemo {

    @SneakyThrows
    public static void main(String[] args) {

        URL url = new URL("http", "www.goidirectory.nic.in", 80,"/index.php");

        BufferedReader br = new BufferedReader(new InputStreamReader( url.openStream()));
        
        br.lines().forEach(System.out::println);

    }
}
