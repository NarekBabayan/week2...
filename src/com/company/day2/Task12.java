package com.company.day2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int qanak = scanner.nextInt();
        int qanak2 = 0;


        for(int i = 1 ; ;i++){
             for(int j = 1; j<=i;j++){
                 if(qanak2!=qanak) {
                     System.out.print(i);
                     qanak2++;
                 }else {
                     break ;
                 }
                 if (qanak==qanak2){
                     break ;
                 }
             }
        }
    }
}
