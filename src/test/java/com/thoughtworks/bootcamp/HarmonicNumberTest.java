package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HarmonicNumberTest {

    @Test
    public void givenHarmonicNumberOne_whenCalculatedItsHarmonicValue_ThenShouldReturnOne()
    {
        HarmonicNumber harmonicNumber = new HarmonicNumber();
        Assertions.assertEquals(1, harmonicNumber.calculateHarmonicValue(1));
    }

    @Test
    public void givenHarmonicNumberTwo_whenCalculatedItsHarmonicValue_ThenShouldReturnResult()
    {
        HarmonicNumber harmonicNumber = new HarmonicNumber();
        Assertions.assertEquals(1.5, harmonicNumber.calculateHarmonicValue(2));
    }

    @Test
    public void givenHarmonicNumberThree_whenCalculatedItsHarmonicValue_ThenShouldReturnResult()
    {
        HarmonicNumber harmonicNumber = new HarmonicNumber();
        Assertions.assertEquals(1.8333333333333333, harmonicNumber.calculateHarmonicValue(3));
    }

    @Test
    public void givenHarmonicNumberSix_whenCalculatedItsHarmonicValue_ThenShouldReturnResult()
    {
        HarmonicNumber harmonicNumber = new HarmonicNumber();
        Assertions.assertEquals(2.4499999999999997, harmonicNumber.calculateHarmonicValue(6));
    }
}
