package com.gigatorb.calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    // Test with empty string
    @Test
    public void testWithEmptyString() throws Exception{
        Calculator calculator = new Calculator();
        double num = calculator.addMe(" ");
        Assert.assertEquals(0, num, 0);
    }

    // Test with null String
    @Test
    public void testWithNullString() throws Exception{
        Calculator calculator = new Calculator();
        double num = calculator.addMe(null);
        Assert.assertEquals(0, num, 0);
    }

    //Test with multiple numbers
    @Test
    public void testWithUnkownAmountOfNumbers() throws Exception{
        Calculator calculator = new Calculator();
        double num = calculator.addMe("3,4,5,6");
        Assert.assertEquals(18, num, 0);
    }

    //Handling new lines between numbers
    @Test
    public void testHandlingNewLines() throws Exception{
        Calculator calculator = new Calculator();
        double num = calculator.addMe("3\n4,5");
        Assert.assertEquals(12, num, 0);
    }

    //Support different delimiters
    @Test
    public void testSupportDifferentDelimiters() throws Exception{
        Calculator calculator = new Calculator();
        double num = calculator.addMe("//;\n1;2");
        Assert.assertEquals(3, num, 0);
    }

    //Support Negative Numbers
    @Test
    public void testWithNegativeNumber() throws Exception{
        Calculator calculator = new Calculator();
        double num = calculator.addMe("1,2,-5,5,-8");
        Assert.assertEquals(3, num, 0);
    }

}
