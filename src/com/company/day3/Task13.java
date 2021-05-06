package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int max = arr[0], min = arr[0];

        for(int i = 0; i<size-1;i++){

            if (arr[i]>=arr[i+1] && arr[i]>=max){
                max = arr[i];
            }
            if (arr[i]<arr[i+1] && arr[i+1]>=max){
                max = arr[i+1];
            }
            if (arr[i]<=arr[i+1] && arr[i]<=min){
                min = arr[i];
            }
            if (arr[i+1]<arr[i] && arr[i+1]<=min){
                min = arr[i+1];
            }
        }

        int minIndex=0, maxIndex=0, myValue;

        for(int i = 0; i<size;i++){
            if(arr[i]==max){
                maxIndex = i;

            }
            if(arr[i]==min){
                minIndex = i;
            }
        }

        myValue=arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = myValue;

        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
}
