package tests;

import models.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testCalculator() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        Assert.assertEquals(result, 3);
    }
}
