package com.company.day2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int index=0;

        if(num<=2*109 && num>=0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    index++;
                }
            }
        }else{
            System.out.println("write 0->218");
        }
        System.out.println(index);
    }
}
