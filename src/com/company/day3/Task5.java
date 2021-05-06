package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i= 0;i<size-1;i++){

            if (arr[i+1]>0 && arr[i]>0){
                System.out.println(arr[i]+" "+ arr[i+1]);
                break;
            }
            if(arr[i+1]<0 && arr[i]<0){
                System.out.println(arr[i]+" "+ arr[i+1]);
                break;
            }
            if(arr[i+1]==0 && arr[i]==0){
                System.out.println(arr[i]+" "+ arr[i+1]);
                break;
            }
        }
    }
}
