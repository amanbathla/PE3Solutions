package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    MatrixAddition matAddition;

    @Before
    public void setUp() throws Exception {
        matAddition = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matAddition = null;
    }

    @Test
    public void matrixaddition() {

        int firstArray[][] = {
                {1,2},{3,4},
                {5,6}
        };
        int secondArray[][] = {
                {9,8},{7,6},
                {5,4}
        };

        int expextedSum[][] = {
                {10,10},{10,10},{10,10}
        };

        assertArrayEquals(expextedSum,matAddition.matrixaddition(firstArray,secondArray));
        assertNotNull(" ");

           }



    @Test
    public void matrixaddition1() {

        int firstArray[][] = {
                {3,4},{5,6},
                {7,8}
        };
        int secondArray[][] = {
                {9,10},{11,12},
                {13,14}
        };

        int expextedSum[][] = {
                {12,14},{16,18},{20,22}
        };

        assertArrayEquals(expextedSum,matAddition.matrixaddition(firstArray,secondArray));
        assertNotNull(" ");

    }
}