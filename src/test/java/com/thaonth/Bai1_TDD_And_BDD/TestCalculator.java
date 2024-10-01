package com.thaonth.Bai1_TDD_And_BDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    private  Calculator calculator = new Calculator();

    @Test
    public void testAddTowPositiveNumbers(){
        int expectedResult = 30;
        int actualResult = calculator.add(10, 20);

        Assert.assertEquals(actualResult, expectedResult, "FAIL. Result is not right.");
    }

    @Test
    public void testAddTowNegativeNumbers(){
        int expectedResult = -30;
        int actualResult = calculator.add(-10, -20);

        Assert.assertEquals(actualResult, expectedResult, "FAIL. Result is not right.");
    }

    @Test
    public void testSubTowNegativeNumbers(){
        int expectedResult = 10;
        int actualResult = calculator.sub(-10, -20);

        Assert.assertEquals(actualResult, expectedResult, "FAIL. Result is not right.");
    }

    @Test
    public void testSubTowPositiveNumbers(){
        int expectedResult = 10;
        int actualResult = calculator.sub(20, 10);

        Assert.assertEquals(actualResult, expectedResult, "FAIL. Result is not right.");
    }

    @Test
    public void testMultiTowPositiveNumbers(){
        int expectedResult = 200;
        int actualResult = calculator.multi(20, 10);

        Assert.assertEquals(actualResult, expectedResult, "FAIL. Result is not right.");
    }

    @Test
    public void testMultiTowNegativeNumbers(){
        int expectedResult = 200;
        int actualResult = calculator.multi(-20, -10);

        Assert.assertEquals(actualResult, expectedResult, "FAIL. Result is not right.");
    }

}
