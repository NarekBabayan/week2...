package com.company.day4;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write n and m");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];


        System.out.println("write elements");
        for (int i= 0; i<matrix.length;i++){
            for (int k =  0; k<matrix[i].length;k++){
                System.out.print("matrix["+i+"]["+k+"] = ");
                matrix[i][k] = scanner.nextInt();
            }
        }
        int max=matrix[0][0];
        int megaMax =0;
        int index=0;
        for (int i = 0; i<matrix.length;i++){
            for (int j = 0 ; j<matrix[i].length-1;j++){
                if (matrix[i][j]>=matrix[i][j+1] && matrix[i][j]>=max){
                    max = matrix[i][j];
                }
                if (matrix[i][j]<matrix[i][j+1] && matrix[i][j+1]>=max){
                    max = matrix[i][j];
                }
            }
            if (megaMax<max){
                megaMax = max;
                index = i;
            }
        }

        System.out.println("megamax= "+megaMax+" "+"index = "+index);

    }
}
