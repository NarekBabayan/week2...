package com.company.day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("write num ");
        int num = scanner.nextInt();
        System.out.print("write d ");
        int d = scanner.nextInt();

        int a , index=0;

        for(;num!=0;){
           a = num %10;
           num = num - a;
           num = num/10;
           if(d==a){
               index++;
           }
        }
        System.out.println(index);

    }
}
