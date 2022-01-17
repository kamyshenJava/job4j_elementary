package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to1010then14d14() {
        double expected = 14.14;
        int x1 = 0;
        int y1 = 0;
        int x2 = 10;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to67then7d81() {
        double expected = 7.81;
        int x1 = 1;
        int y1 = 1;
        int x2 = 6;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when78to1520then14d42() {
        double expected = 14.42;
        int x1 = 7;
        int y1 = 8;
        int x2 = 15;
        int y2 = 20;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}