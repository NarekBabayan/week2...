package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int add=0, num;

        for (int i = 1; i<=10;i++){
            System.out.print("write number ");
             num = scanner.nextInt();
             add = add + num;
        }
        System.out.println(add);
    }
}
