package com.company.day2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num>=2 && num<=30000){
            for(int i = 2; i<=num; i++){
                if(num%i==0){
                    System.out.println(i);
                    break;
                }
            }

        }else{
            System.out.println("write number of range 2->30000");
        }
    }
}
