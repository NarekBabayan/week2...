package com.company;

import java.util.Scanner;

public class Task8 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int index = 1;

        for(int i = 0; i<size-1; i++){
            if(arr[i+1]!=arr[i]){
                index++;
            }
        }
        System.out.println("index = "+index);
    }
}
