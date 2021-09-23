package com.gigatorb.calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    // Test with empty string
    @Test
    public void testWithEmptyString(){
        Calculator calculator = new Calculator();
        double num = calculator.addMe("");
        Assert.assertEquals(0, num, 0);
    }

    // Test with null String
    @Test
    public void testWithNullString(){
        Calculator calculator = new Calculator();
        double num = calculator.addMe(null);
        Assert.assertEquals(0, num, 0);
    }

    //Test with multiple numbers
    @Test
    public void testWithUnkownAmountOfNumbers(){
        Calculator calculator = new Calculator();
        double num = calculator.addMe("3,4,5,6");
        Assert.assertEquals(18, num, 0);
    }
}
