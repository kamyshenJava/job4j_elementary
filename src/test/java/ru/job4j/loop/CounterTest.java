package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom5To16Then66() {
        int start = 5;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 66;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom2To11Then30() {
        int start = 2;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }
}