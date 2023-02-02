package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when23to29then6() {
        Point a = new Point(2, 3);
        Point b = new Point(2, 9);
        double expected = 6;
        double out = a.distance(b);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void when68to35then4dot24() {
        Point a = new Point(6, 8);
        Point b = new Point(3, 5);
        double expected = 4.24;
        double out = a.distance(b);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void when63to48then5dot38() {
        double expected = 5.38;
        Point a = new Point(6, 3);
        Point b = new Point(4, 8);
        double out = a.distance(b);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }
}