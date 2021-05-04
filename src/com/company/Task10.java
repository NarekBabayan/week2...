package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("write binar number");
        int myBin = scanner.nextInt();
        int qanak = -1;
        int a,add,maxAdd=0;

        for(;myBin!=0;){
            qanak++;
            a=myBin%10;
            myBin = myBin - a;
            myBin = myBin/10;
            add =a* (int)Math.pow(2,qanak);
            maxAdd = maxAdd + add;

        }
        System.out.println(maxAdd);
     }
}
