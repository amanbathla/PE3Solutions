package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {


    ConsecutiveNumbers consecutiveNumbers;

    @Before
    public void setUp() throws Exception {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumbers = null;
    }

    @Test
    public void consecutiveNumbers() {

        assertTrue(consecutiveNumbers.consecutiveNumbers("56 55 54"));
        assertTrue(consecutiveNumbers.consecutiveNumbers("54 55 56"));
        assertFalse(consecutiveNumbers.consecutiveNumbers("56 55 56 55 56"));
    }

    @Test
    public void consecutiveNumbers1() {

        assertTrue(consecutiveNumbers.consecutiveNumbers("55 54 53"));
        assertTrue(consecutiveNumbers.consecutiveNumbers("94 95 96"));
        assertFalse(consecutiveNumbers.consecutiveNumbers("56 55 56 55 56"));
    }
}