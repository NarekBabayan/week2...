package com.company;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int num=0;

        for(int i = 1; i<=n; i++){
            if (i==1){
                System.out.print("    ");
            }
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("");

        for(int i = 1; i<=n; i++){
            System.out.print(i+"   ");

            for(int j = 1;j<=n;j++){
                if(j==1) {
                    num = i;
                }
                System.out.print(num+ " ");
                num = num + i;

            }
            System.out.println("");

        }
    }
}
