package com.company.day4;

import java.util.Scanner;

public class Task6 {
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







        int[][] myArr = new int[n][2];

        int megaMax = 0;

        for (int i = 0; i<matrix.length;i++){
            int max = 0;
            for (int j = 0 ; j<matrix[i].length-1;j++){
                if (matrix[i][j]>=matrix[i][j+1] && matrix[i][j]>=max){
                    max = matrix[i][j];
                }
                if (matrix[i][j]<matrix[i][j+1] && matrix[i][j+1]>=max){
                    max = matrix[i][j];
                }
            }
            myArr[i][0]= max;
        }


        for (int i = 0; i<matrix.length;i++){
           int sum = 0;
            for (int j = 0 ; j<matrix[i].length;j++){
                sum = sum+ matrix[i][j];
            }
            myArr[i][1]= sum;
        }


        for (int i= 0; i<myArr.length;i++){
            for (int k =  0; k<myArr[i].length;k++){
                System.out.print(myArr[i][k]);
            }
            System.out.println("");
        }













    }
}
