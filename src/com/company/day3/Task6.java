package com.company;

import java.util.Scanner;

public class Task6 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int max=0;
        for(int i = 0; i<size-1;i++){
            if(arr[i+1]>=arr[i] && arr[i+1]>=max){
                max = arr[i+1];
            }
            if(arr[i+1]<arr[i] && arr[i]<max){
                max = arr[i];
            }
        }

        for(int i = 0; i<size;i++){
            if(arr[i]==max){
                System.out.println("max = "+max);
                System.out.println("index = "+i);
                break;
            }
        }
    }
}
