package com.ytebboune;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListeTest {

    @Test(expected = Exception.class)
    public void whenTailleIsNegative_thenException() throws Exception {
        Liste.partition(Arrays.asList(1, 2, 3, 4, 5), -2);
    }

    @Test(expected = Exception.class)
    public void whenTailleIsEqualToZero_thenException() throws Exception {
        Liste.partition(Arrays.asList(1, 2, 3, 4, 5), 0);
    }

    @Test(expected = Exception.class)
    public void whenListIsNull_thenException() throws Exception {
        Liste.partition(null, 3);
    }

    @Test(expected = Exception.class)
    public void whenListIsEmpty_thenException() throws Exception {
        List<List<Integer>> list = Liste.partition(Arrays.asList(), 3);
        Assert.assertEquals(Arrays.asList(), list);
    }

    @Test
    public void whenListIsNotEmptyAndTailleIsSuperiorToZero_thenReturnList() throws Exception {
        List<List<Integer>> list = Liste.partition(Arrays.asList(1, 6, 3, 4, 5), 3);
        Assert.assertEquals(Arrays.asList(Arrays.asList(1, 6, 3), Arrays.asList(4, 5)), list);
    }

}