package com.company;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int myValue = arr[arr.length-1];

        for(int i = arr.length-2; i>=0;i--){
           arr[i+1] = arr[i];
        }
        arr[0] = myValue;

        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
