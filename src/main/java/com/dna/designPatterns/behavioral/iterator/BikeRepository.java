package com.dna.designPatterns.behavioral.iterator;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes = new String[10];
    private int index;

    public String addBike(String bike) {

        if ( index == bikes.length ) {
            String[] largeArray = new String[ index + (index/2)];
            System.arraycopy(bike, 0, largeArray, 0, bike.length());
            bikes = largeArray;
            largeArray = null;  // Now eligible for garbage collection
        }
        bikes[index++] = bike;
        return bike;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int internalCount =0;
            private int lastModCnt = index;

            @Override
            public boolean hasNext() {
                checkModification();
                return internalCount < lastModCnt;
            }

            @Override
            public String next() {
                checkModification();
                return bikes[internalCount++];
            }

            private void checkModification() {
                if (lastModCnt != index) {
                    throw new ConcurrentModificationException();
                }
            }
        };
    }
}
