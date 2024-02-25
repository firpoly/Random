package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected  int min,  max;
    public Randoms(int min, int max) {
        random= new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {

        Iterator<Integer> iterator = new Iterator<Integer>() {
            private int nextIntI = random.nextInt(max + 1 - min) + min;
            @Override
            public boolean hasNext() {
                if (nextIntI <= max && nextIntI >= min) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {

                nextIntI = random.nextInt(max + 1 - min) + min;
                return nextIntI;
            }
        };
        return iterator;
    }


}
