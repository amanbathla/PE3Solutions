package com.stackroute;

public class ChessBoard {


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
            for (String str : chessBoard[i]) {
                System.out.println(str);
            }


        }

        return chessBoard;
    }
}
