package com.company;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }


        for(int i = 0; i<=arr.length-1;i++){

            int quantity = 0;

           for(int j = 0; j<=arr.length-1;j++){
               if(arr[i]==arr[j] && i!=j){
                   quantity++;
               }
           }
           if (quantity==0){
               System.out.println(arr[i]);
           }
        }


    }
}
