package com.company.day2;

import java.util.Scanner;

public class Task11 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("write qanak ");
        int numQanak = scanner.nextInt();
        int num;
        int zero=0, positive = 0, negative = 0;

        for(int i = 1;i<=numQanak;i++) {
            System.out.print("write numbers  ");
            num = scanner.nextInt();
            if(num>0){
                positive++;
            }
            if(num==0){
                zero++;
            }
            if (num<0){
                negative++;
            }
        }
        System.out.println("zroneri qanak = "+zero);
        System.out.println("drakanneri qanak = "+positive);
        System.out.println("bacasakanneri qanak = "+negative);

    }
}
