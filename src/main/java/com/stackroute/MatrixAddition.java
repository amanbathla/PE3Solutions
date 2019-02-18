package com.stackroute;



//Write a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix
//Output:
//Input number of rows of matrix: 3
//Input number of columns of matrix: 2
//Input elements of first matrix: 1 2 3 4 5 6
//Input the elements of second matrix: 9 8 7 6 5 4
//Sum of the matrices:-
//10 10
//10 10
//10 10

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
