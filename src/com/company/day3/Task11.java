package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        for(int i = 0; i<=arr.length-2;i=i+2){
            int myValue = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=myValue;
        }

        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
