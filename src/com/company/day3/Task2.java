package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] arr =new int[number+1];

        for(int i=1; i<=arr.length;i++){
            arr[i-1]=i;
        }

        for(int i=1; i<=arr.length-1;i=i+2){
            System.out.println(arr[i]);
        }



    }
}
