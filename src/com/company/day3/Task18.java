package com.company;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("write n = ");
        int n = scanner.nextInt();

        for (int i = 0; i<size;i++){
            int quantity = 1;
            int quantity2 = 0;
            for (int j = i+1;j<size;j++){
                if(arr[i]==arr[j]){
                        quantity++;
                }
            }
            for(int k =0 ; k<=i;k++){
                if (arr[k]==arr[i] && i!=k){
                    quantity2++;
                }
            }
            if (quantity>=n/2 && quantity2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
