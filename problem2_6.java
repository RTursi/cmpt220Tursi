/*
JOE TURSI
PROF. RIVAS
SOFTWARE DEV.
LAB 1
problem 2.6
*/

import java.util.Scanner;
public class problem2_6 {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);	
  System.out.print("Enter a number between 0 and 1000: ");
    int number = input.nextInt();
    int percent = number % 10;		
	  number /= 10;							
	int tens = number % 10;				
	  number /= 10;							
	int hundreds = number % 10;		
	  number /= 10;							
	int sum = hundreds + tens + percent;	
  System.out.println("The sum of the digits is " + sum);
	}
}