package com.company.day2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("*");
            for(int j = 1;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
