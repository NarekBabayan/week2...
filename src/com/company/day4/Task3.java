package com.company.day4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("write n ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];


        System.out.println("write elements");
        for (int i= 0; i<matrix.length;i++){
            for (int k =  0; k<matrix.length;k++){
                matrix[i][k] = scanner.nextInt();
            }
        }
        boolean myBool = true;
        for (int i = 0; i<matrix.length;i++){
            for (int j=0; j<matrix.length;j++){
                if(matrix[i][j]!=matrix[j][i] && i!=j){
                    myBool = false;
                }
            }
        }

        if (myBool==true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
