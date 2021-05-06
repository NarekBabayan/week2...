package com.company.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("write num1 ");
        int num1 = scanner.nextInt();
        System.out.print("write num2 ");
        int num2 = scanner.nextInt();
        System.out.print("write cMnacord ");
        int cMnacord = scanner.nextInt();
        System.out.print("write dBajanarar ");
        int dBajanarar = scanner.nextInt();

        for(int i = Math.min(num1,num2); i<=Math.max(num1,num2);i++){
            if(i%dBajanarar==cMnacord){
                System.out.println(i);
            }
        }
    }
}
