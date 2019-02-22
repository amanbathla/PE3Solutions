package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FirstAndLAstDayOfWeekTest {

    FirstAndLAstDayOfWeek lAstDayOfWeek;
    @Before
    public void setUp() throws Exception {
        lAstDayOfWeek = new FirstAndLAstDayOfWeek();

    }

    @After
    public void tearDown() throws Exception {
        lAstDayOfWeek = null;
    }

    @Test
    public void findLastDate() {
        assertEquals("SUN 4/1/2020",lAstDayOfWeek.findLastDate(28,12,2019));
        assertEquals("SUN 4/2/2019",lAstDayOfWeek.findLastDate(28,12,2019));
        assertEquals("SUN 30/1/2019",lAstDayOfWeek.findLastDate(28,12,2019));
    }

}