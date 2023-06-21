package com.company;
import org.junit.Test;
import static org.junit.Assert.*;
public class TesttNumbersTest {
    @Test
    public void sum() {
        TesttNumbers object = new TesttNumbers();
        int actual = object.sum(15);
        int expected = 45;
        assertEquals(expected,actual);
    }
    @Test
    public void sum2() {
        TesttNumbers object = new TesttNumbers();
        int actual = object.sum(10);
        int expected = 45;
        assertEquals(expected,actual);
    }
}