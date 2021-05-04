package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for(int i = Math.min(num1,num2); i<=Math.max(num1,num2); i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
