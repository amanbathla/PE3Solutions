package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {


    ChessBoard chessBoard ;

    // Before and after class

    @Before
    public void setUp() throws Exception {
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard = null;
    }

    //Function to create chess board

    @Test
    public void createChessBoard() {
       String[][] expectedArray = { {"WW","BB","WW","BB","WW","BB","WW","BB"},
        {"BB","WW","BB","WW","BB","WW","BB","WW"},
        {"WW","BB","WW","BB","WW","BB","WW","BB"},
        {"BB","WW","BB","WW","BB","WW","BB","WW"},
        {"WW","BB","WW","BB","WW","BB","WW","BB"},
        {"BB","WW","BB","WW","BB","WW","BB","WW"},
        {"WW","BB","WW","BB","WW","BB","WW","BB"},
        {"BB","WW","BB","WW","BB","WW","BB","WW"}};
       assertArrayEquals(expectedArray,chessBoard.createChessBoard());

        //assertArrayEquals();
    }
}