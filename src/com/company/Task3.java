package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("min = ");
        double min  = scanner.nextDouble();
        System.out.print("max = ");
        double max  = scanner.nextDouble();
        for (double i = min; i<=max; i++){
            int integer =(int) Math.sqrt(i);
            if(integer*integer==i){
                System.out.println(i);
            }
        }

    }
}
