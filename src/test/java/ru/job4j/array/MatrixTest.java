package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void when3on3() {
        int size = 3;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when4on4() {
        int size = 4;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16},
        };
        Assert.assertArrayEquals(expected, result);
    }
}