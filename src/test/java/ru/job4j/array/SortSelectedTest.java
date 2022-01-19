package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {31, 14, 14, 27, 53};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {14, 14, 27, 31, 53};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {36, 4, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 11, 36};
        Assert.assertArrayEquals(expected, result);
    }
}