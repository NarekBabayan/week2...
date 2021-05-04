package com.company;

import java.util.Scanner;

public class Task14 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int qanak=0;
        int n = scanner.nextInt();

        for(int i = 1; i<=n; i++){
            qanak++;
            if (qanak%2==0){
                System.out.print(" *");
            }else{
                System.out.print("*");
            }
            for(int j = 1;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
