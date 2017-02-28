/*
Joe Tursi
Dr. Rivas
cmpt220
lab2

Write a program that recieves an ASCII code(an interger between 0 and 127)and displays its character. 
*/
import java.util.Scanner;
  public class problem_4_8{
  	public static void main(String[]args){
  		Scanner input = new Scanner(System.in);
  		  System.out.println("Enter an ASCII code: ");
  		    int asc = input.nextInt();
  		      System.out.println((char)asc);

  	}
  }