package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write array's size");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size;i++){

            System.out.println("write array's elements");
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i<size-1;i++){
            if(arr[i+1]>arr[i]){
                System.out.println(arr[i+1]+" ");
            }
        }

    }
}
