package com.company.day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i= 0; i<matrix.length;i++){
            for (int k =  0; k<matrix.length;k++){
                matrix[i][k] = 0;
            }
        }

        int num = matrix.length-1;
        for (int i= 0; i<matrix.length;i++){
            for (int k =  matrix.length-1; k>=num ;k--){
                matrix[i][k] = 1;
            }
            num--;
        }

        for (int i= 0; i<matrix.length;i++){
            for (int k =  0; k<matrix.length;k++){
                System.out.print(matrix[i][k]);
            }
            System.out.println("");
        }

    }
}
