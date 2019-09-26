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
    public void givenHarmonicNumberTwo_whenCalculatedItsHarmonicValue_ThenShouldReturnOne()
    {
        HarmonicNumber harmonicNumber = new HarmonicNumber();
        Assertions.assertEquals(1.5, harmonicNumber.calculateHarmonicValue(2));
    }
}
