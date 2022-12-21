package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when23to29then6() {
        double expected = 6;
        int x1 = 2;
        int y1 = 3;
        int x2 = 2;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void when68to35then4dot24() {
        double expected = 4.24;
        int x1 = 6;
        int y1 = 8;
        int x2 = 3;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void when63to48then5dot38() {
        double expected = 5.38;
        int x1 = 6;
        int y1 = 3;
        int x2 = 4;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }
}