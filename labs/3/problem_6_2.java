/* 
Joe Tursi
Professor Rivas
CMPT220
LAB3

(Sum the digits in an integer) Write a method that computes the sum of the digits
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
to extract digits, and the / operator to remove the extracted digit. For instance,
to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
(= 23). Use a loop to repeatedly extract and remove the digit until all the digits
are extracted. Write a test program that prompts the user to enter an integer and
displays the sum of all its digits.
*/

import java.util.Scanner;
  public class problem_6_2{
  	public static void main(String[]args){
  	  Scanner input = new Scanner(System.in);
  	    System.out.println("Enter a integer! ");
  	      long num = input.nextLong();
  	        System.out.println("The sum of digits " +num+ " is " +sumDigits(num));
  	}
  	public static long sumDigits(long k){
  	  int sum = 0;
  	    while(k > 0){
  	      sum += k % 10;
  	        k /= 10;
  	    }
  	    return sum;
  	}
  }