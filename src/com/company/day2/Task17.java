package com.company.day2;

import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        char myChar;
        int quantity=password.length();
        int smallQuantity=0, largeQuantity=0, numQuantity=0, symbolQuantity=0;
        int unicode;

     if(quantity>=6 && quantity<=16) {
         for (int i = 0; i <= password.length() - 1; i++) {
             myChar = password.charAt(i);
             unicode = (int) myChar;
             if (unicode >= 48 && unicode >= 57) {
                 numQuantity++;
             }
             if (unicode >= 97 && unicode >= 122) {
                 smallQuantity++;
             }
             if (unicode >= 65 && unicode >= 90) {
                 largeQuantity++;
             }
             if (unicode == 35 || unicode == 64 || unicode == 36) {
                 symbolQuantity++;
             }
         }

         if (numQuantity>=1 && smallQuantity>=1 && largeQuantity>=1 && symbolQuantity>=1){
             System.out.println("Valid");
         }else {
             System.out.println("inValid");
         }

     }else{
         System.out.println("the password's length should be 6-16.  inValid");
     }






    }
}
