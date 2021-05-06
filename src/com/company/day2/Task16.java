package com.company.day2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i= 1; i<=n;i++){
          for(int j=1; j<=i; j++)  {
              System.out.print("*");
          }
            System.out.println("");
        }

        System.out.println(" ");

        for(int i= n; i>=1;i--){
            for(int j=1; j<=i; j++)  {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("  ");

        int mycikl= 0;

       for(int i = n; i>=1;i--){
           for(int j = 1; j<=i;j++){
               if(j ==1){

                   for(int mycikl2 = mycikl;mycikl2>0;mycikl2--) {
                       System.out.print(" ");
                   }
               }
               System.out.print("*");
           }
           System.out.println("");
           mycikl++;
       }

        System.out.println("  ");

        int myCikl=n;

        for(int i = 1; i<=n;i++){
            int num = 0;
           for(int j = 1; j<=i;j++){
               if( j!=n && myCikl!=0 && num==0){

                   for(int mycikl2 = myCikl;mycikl2>0;mycikl2--) {
                       System.out.print(" ");
                   }
               }
               System.out.print("*");
               num++;
           }
           System.out.println("");
           myCikl--;
       }




    }
}

