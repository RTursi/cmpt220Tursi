/* 
Joe Tursi
Professor Rivas
CMPT220
LAB3


(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.

*/

import java.util.Scanner;
  public class problem_6_3{
  	public static void main(String[]args){
  	  Scanner input = new Scanner(System.in);
  	    System.out.println("Enter an integer: ");
  	      int num = input.nextInt();
  	        System.out.println(num + (isPalindrome(num) ? "is " " is not a palindrome"));

  	}
  	public static boolean isPalindrome(int num){
  	  return num == reverse(number) true : false;

  	}
  	public static int reverse(int num){
  		String
  	}
  }