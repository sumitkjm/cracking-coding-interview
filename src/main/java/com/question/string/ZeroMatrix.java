package com.question.string;

public class ZeroMatrix {

    public static void main(String args[]) {
        int [][] matrix = {{1,3,2,0},{3,2,2,8},{1,0,3,9},{2,1,6,7},{3,1,7,4}};
        int [][] zeroIndex = new int[matrix.length][2];
        printMatrix(matrix);
        int count = zeroMatrix(matrix, matrix.length,matrix.length-1, zeroIndex);
        for(int i=0;i<count;i++) {
            zeroRow(matrix,matrix.length,matrix.length-1,zeroIndex[i][0],zeroIndex[i][1]);
        }
        printMatrix(matrix);
    }

    private static int zeroMatrix(int[][] matrix, int m, int n, int[][]zeroIndex) {
        int count = 0;
        for (int i =0;i<m;i++) {
            for (int j=0;j<n;j++) {
                if(matrix[i][j]==0) {
                    // 0,3
                    zeroIndex[count][0] = i;
                    zeroIndex[count][1] = j;
                    count++;
//                    zeroRow(matrix,m,i,j);
//                    zeroCol(matrix,n,i,j);
                    break;
                }
            }
        }
        return count;
    }


    public static void zeroRow(int[][] matrix, int m, int n, int row, int col) {
        for(int i=0;i<m;i++) {
            matrix[i][col] = 0;
        }

        for(int i=0;i<n;i++) {
            matrix[row][i] = 0;
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
