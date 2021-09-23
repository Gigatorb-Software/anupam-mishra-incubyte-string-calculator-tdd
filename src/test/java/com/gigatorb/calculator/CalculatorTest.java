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
}
