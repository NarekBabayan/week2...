package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int[] arr2 = new int[size];

        int index=0;

        for(int i = size-1; i>=0;i--){
            arr2[index] = arr[i];
            index++;
        }

        for(int i = 0; i<size; i++){
            System.out.println(arr2[i]);
        }


    }
}
