package com.company.day4;

import java.util.Scanner;

public class Task4 {
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

       int[] arr = new int[n];
        int index=0, max=0;

        for(int i =0; i<matrix.length;i++){
            int sum = 0;
            for (int j = 0; j<matrix[i].length;j++){
                sum = sum + matrix[i][j];
            }
            arr[i] = sum;
        }



        for (int i = 0; i<arr.length-1;i++){
            if (arr[i]>=arr[i+1] && arr[i]>=max){
                max = arr[i];
                index = i;
            }
            if (arr[i]<arr[i+1] && arr[i+1]>=max){
                max = arr[i+1];
                index = i;
            }

        }

        System.out.println("index = "+index);
        System.out.println("sum = "+ max);
//        //region print matrix
//        for (int i= 0; i<matrix.length;i++){
//            for (int k =  0; k<matrix.length;k++){
//                System.out.print(matrix[i][k]);
//            }
//            System.out.println("");
//        }
//        //endregion
   }
}
