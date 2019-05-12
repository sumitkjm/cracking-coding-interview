package com.question.string;

public class ZeroMatrixOptimized {

    public static void main(String args[]) {
        int [][] matrix = {{1,3,2,0},{3,2,2,8},{1,0,3,9},{2,1,6,7},{3,1,7,4}};
        int [][] zeroIndex = new int[matrix.length][2];
        printMatrix(matrix);
        zeroMatrix(matrix, matrix.length,matrix.length-1, zeroIndex);
        printMatrix(matrix);
        for(int i=1;i<matrix.length;i++) {
            if(matrix[i][0]==0) {
                zeroRow(matrix, matrix.length-1, i);
            }
        }

        for(int i=1;i<matrix.length-1;i++) {
            if(matrix[0][i]==0) {
                zeroCol(matrix, matrix.length, i);
            }
        }
        if(matrix[0][0]==0) {
            zeroRow(matrix,matrix.length-1,0);
        }
        printMatrix(matrix);
    }

    private static void zeroMatrix(int[][] matrix, int m, int n, int[][]zeroIndex) {
        for (int i =0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if(matrix[i][j]==0) {
                    // 0,3
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    break;
                }
            }
        }
    }


    public static void zeroRow(int[][] matrix, int m, int rowNum) {
        for(int i=0;i<m;i++) {
            matrix[rowNum][i] = 0;
        }


    }

    public static void zeroCol(int[][] matrix, int m, int colNum) {
        for(int i=0;i<m;i++) {
            matrix[i][colNum] = 0;
        }
    }


    public static void  printMatrix(int [][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j =0;j<matrix.length-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
