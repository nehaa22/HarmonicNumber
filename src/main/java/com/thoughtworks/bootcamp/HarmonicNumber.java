package com.thoughtworks.bootcamp;

public class HarmonicNumber {

    public double calculateHarmonicValue(int number) {
        double res = 0.0;

        for (int i = 1; i <= number; i++) {
            res += (1.0 / i);
        }
        return res;
    }
}
