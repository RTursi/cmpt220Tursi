/* 
Joe Tursi
Dr. Rivas
cmpt220
lab2

Write a program that prompts the user to enter three integers and display the integers in non-decreasing order
*/

import java.util.Scanner;
  public class problem_3_8{
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      //User enters the numbers 
        System.print.ln("Enter three integers");
          int num1 = input.nextInt();
            int num2 = input.nextInt();
              int num3 = input.nextInt();
              // Sort numbers
               int bleg;
                 if(num2 < num1 || num3 < num1){
                   if(num2 < num1){
                     bleg = num1;
                       num1 = num2;
                         num2 = bleg;
                   }
                     if(num3 < num1){
                       bleg = num1;
                   	     num1 = num3;
                   	       num3 = bleg;
                   }
                     if(num3 < num2){
                       bleg = num2;
                         num2 = num3;
                           num3 = bleg;
                     }
                 }
                     System.out.println(num1 + " " + num2 + " " +num3);
  }
}