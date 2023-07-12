package org.example;

import static java.lang.System.*;

public class SumCalculator {

    public static int sum (int n) {

        if(n<1){
            throw new IllegalArgumentException("can't be calculated for number less than 1");
        }

        int sumN = 0;
        for (int i = 1; i <= n; i++) {
            sumN += i;
        }
        return sumN;
    }

}
