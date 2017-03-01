/*
Joe Tursi
Dr. Rivas
cmpt220
lab2

(Phone key pads) The international standard letter/number mapping found on the
telephone is shown below:
Write a program that prompts the user to enter a letter and displays its corresponding
number.
*/
import java.util.Scanner;
  public class problem_4_15{
  	public static void main(String[args]){
  		Scanner input = new Scanner(System.in);
  		  System.out.println("Enter a letter" );
  		    String p = input.nextLine();
  		      char q = p.charAt(0);
  		      q = Character.toUpperCase(ch);
  		        int num = 0;
  		          if(Character.isLetter(q)){
  		          	if(q >= 'W')
  		              num=9;
  		            else if(q>= 'T')
  		            	num=8;
  		            else if (ch >= 'P')
				      num = 7;
			        else if (ch >= 'M')
				      num = 6;
			        else if (ch >= 'J')
				      num = 5;
			        else if (ch >= 'G')
				      num = 4;
			        else if (ch >= 'D')
				      num = 3;
			        else if (ch >= 'A')
				      num = 2;
			System.out.println("corresponding number is " + num);
  		          }
  	}
  }