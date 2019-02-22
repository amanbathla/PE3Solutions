package com.stackroute;


//Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//WWrepresents white color and BB represents Black color.
//Output:
//My Chess Board
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|
//WW|BB|WW|BB|WW|BB|WW|BB|
//BB|WW|BB|WW|BB|WW|BB|WW|


public class ChessBoard {



    // function for chess board logic

    public String[][] createChessBoard(){

        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if ((i+j)%2 == 0 ) {
                    chessBoard[i][j] = "WW";
                }
                else {
                    chessBoard[i][j] = "BB";
                }


            }
       
        }

        return chessBoard;
    }
}
