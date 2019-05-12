package com.question.string;

public class RotateMatrix {

    public static void main(String args[]) {
        char [][] matrix = {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'},{'m','n','o','p'}};
        printMatrix(matrix);
        rotate90(matrix);
    }

    public static void  printMatrix(char [][] matrix) {
        for(int i=0;i<matrix[0].length;i++) {
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void rotate90(char [][] matrix) {
        // number of times rotation cycle needed
        for (int i=0;i<matrix.length/2;i++) {
            // replace from a[i][i] to  a[(matrix.length-1)-i][(matrix.length-1)-i]

            for (int j =i;j<matrix.length-i;j++) {
                for (int k = i;k<matrix.length-i;k++) {
                    // Source matrix[j][k] and target matrix[k][matrix.length-i]
                    System.out.print(matrix[j][k] + " to "+ matrix[k][matrix.length-1-i] + "\t");
                }
                System.out.println("");
            }
            //
        }
    }

    public static class ZeroMatrix {
    }
}
