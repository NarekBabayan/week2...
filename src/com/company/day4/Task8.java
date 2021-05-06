package com.company.day4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write n and m");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];
        int[][] matrixC = new int[n][m];


        System.out.println("write elements matrixA");
        for (int i = 0;i<matrixA.length;i++){
            for (int k =  0; k<matrixA[i].length;k++){
                System.out.print("matrix["+i+"]["+k+"] = ");
                matrixA[i][k] = scanner.nextInt();
            }
        }

        System.out.println("write elements matrixB");
        for (int i= 0; i<matrixB.length;i++){
            for (int k =  0; k<matrixB[i].length;k++){
                System.out.print("matrix["+i+"]["+k+"] = ");
                matrixB[i][k] = scanner.nextInt();
            }
        }

        for (int i = 0; i<matrixC.length;i++){
            for (int j = 0; j<matrixC[i].length;j++){
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i= 0; i<matrixC.length;i++){
            for (int k =  0; k<matrixC[i].length;k++){
                System.out.print(matrixC[i][k]+" ");
            }
            System.out.println("");
        }
    }
}
