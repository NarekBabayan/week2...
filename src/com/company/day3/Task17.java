package com.company;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int quantity = 0;
        for(int i = 0; i<size-1;i++){
            if (arr[i]<=arr[i+1]){
                quantity++;
            }
        }
        if(quantity==arr.length-1){
            System.out.println("array sorted.");
        }else {
            System.out.println("array not sorted.");
        }
    }
}
