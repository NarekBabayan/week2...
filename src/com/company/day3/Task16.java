package com.company;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        int temp;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==0 && arr[j]!=0)
                {
                    temp  =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }


        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }

    }
}
