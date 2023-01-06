package ru.eug.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void add() {
        assertEquals(AppFirst.add(6,7),13);
    }
}