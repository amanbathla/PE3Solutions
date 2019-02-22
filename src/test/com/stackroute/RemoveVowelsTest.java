package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    RemoveVowels removeVowels;
    @Before
    public void setUp() throws Exception {
        removeVowels = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        removeVowels = null;
    }

    @Test
    public void stringwithoutvowels() {

        String[] Array = {"India","United States","Egypt","Germeny","czechoslovakia"};
        String[] expectedArray = {"Ind","Untd Stts","Egypt","Grmny","czchslvk"};
        String[] unexpectedArray = {"India","Untaxd Stts","Egdddsypt","Grmny","czchdslvk"};

        assertArrayEquals(expectedArray,removeVowels.stringwithoutvowels(Array));
        assertNotEquals(unexpectedArray,removeVowels.stringwithoutvowels(Array));

    }


    @Test
    public void stringwithoutvowels1() {

        String[] Array = {"India","United States","Egypt","Germeny","Pakistan"};
        String[] expectedArray = {"Ind","Untd Stts","Egypt","Grmny","Pkstn"};
        String[] unexpectedArray = {"India","Untaxd Stts","Egdddsypt","Grmny","czchdslvk"};

        assertArrayEquals(expectedArray,removeVowels.stringwithoutvowels(Array));
        assertNotEquals(unexpectedArray,removeVowels.stringwithoutvowels(Array));

    }



}