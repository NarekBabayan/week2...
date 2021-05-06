package com.company;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("write k index");
        int kIndex = scanner.nextInt();

        for(int i = kIndex; i<=arr.length-2;i++){
            arr[i] = arr[i+1];
        }

        for(int i = 0; i<size-1; i++){
            System.out.println(arr[i]);
        }
    }
}
