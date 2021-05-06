package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int index = arr.length-1;

         for(int i = 0; i<=(arr.length)/2-1;i++){
             int myValue = arr[i];
             arr[i] = arr[index];
             arr[index] = myValue;
             index--;
         }

        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
