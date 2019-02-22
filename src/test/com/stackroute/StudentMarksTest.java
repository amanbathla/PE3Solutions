package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks stdMArks;

    @Before
    public void setUp() throws Exception {
        stdMArks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        stdMArks = null;
    }

    @Test
    public void isGradeCorrect() {
       int noOfStudents = 4;
       String[] Grades = {"50","60","70","80"};
       String[] Grades1 = {"50","60","aman","80"};
       String[] Grades2 = {"50","-17","70","aman"};


       assertEquals(true,stdMArks.isGradeCorrect(Grades,noOfStudents));
       assertNotEquals(false,stdMArks.isGradeCorrect(Grades1,noOfStudents));
       assertEquals(false,stdMArks.isGradeCorrect(Grades2,noOfStudents));

    }

    @Test
    public void isGradeCorrect1() {
        int noOfStudents = 4;
        String[] Grades = {"80","90","100","40"};
        String[] Grades1 = {"50","60","110","80"};
        String[] Grades2 = {"50","-17","70","aman"};


        assertEquals(true,stdMArks.isGradeCorrect(Grades,noOfStudents));
        assertNotEquals(false,stdMArks.isGradeCorrect(Grades1,noOfStudents));
        assertEquals(false,stdMArks.isGradeCorrect(Grades2,noOfStudents));

    }
}