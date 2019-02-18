package com.stackroute;

public class MatrixAddition {


    public int[][] matrixaddition(int[][] firstMatrix,int[][] secondMatrix){

        int rows = firstMatrix.length;
        int col = firstMatrix[0].length;

        int[][] actualSum = new int[rows][col];

        for(int i = 0;i<rows;i++){
            for(int j= 0;j<col;j++){
                actualSum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return actualSum;
    }


}
