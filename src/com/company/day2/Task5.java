package com.company.day2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("write num ");
        int num = scanner.nextInt();

        int a;

        for(;num!=0;){
            a = num %10;
            num = num - a;
            num = num/10;
            System.out.print(a);
        }

    }
}
