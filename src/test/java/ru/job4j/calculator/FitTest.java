package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeight187ThenWeight100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenWomanHeight165ThenWeight63() {
        short in = 165;
        double expected = 63.24;
        double out = Fit.womanWeight(in);
        double eps = 0.01;
        Assert.assertEquals(expected, out, eps);
    }
}