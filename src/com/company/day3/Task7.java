package com.company;

import java.util.Scanner;

public class Task7 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("write elements");
        for(int i = 0; i<size; i++){
            arr[i]= scanner.nextInt();
        }

        boolean a=true;
        int b = 0;
        int min=0;

        for(int i = 0; i<size; i++){
            if(Math.abs(arr[i])>1000){
                a = false;
            }
            if (arr[i]>0){
                b++;
            }
        }


        if(a==true && b>0){

            for (int i = 0; i<size;i++){
                if(arr[i]>0){
                    min=arr[i];
                    break;
                }
            }

            for(int i=0; i<size;i++){
                if (arr[i]>0 && arr[i]<=min){
                    min = arr[i];
                }
                if(arr[i]>0 && arr[i]>min){
                    min = min;
                }
            }

            System.out.println("min = "+min);

        }else{
            System.out.println("write -1000->1000 integer number and least one positive element ");
        }

    }
}
