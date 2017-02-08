/*
Joe Tursi
Dr. Rivas
cmpt220
lab2

(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
uppercase letters followed by four digits. Write a program to generate a plate
number.
*/
public class problem_4_25{
  public static void main(String[]args){
  	int letter1 = (int)(Math.random());
  	  int letter2 = (int)(Math.random());
  	    int letter3 = (int)(Math.random());

  	      int num1 = (int)(Math.random());
  	        int num2 = (int)(Math.random());
  	          int num3 = (int)(Math.random());
  	            int num4 = (int)(Math.random());
  	              System.out.println("" +(char)(letter1)+ ((char)(letter2)) + (char(letter3)) + num1 + num2 + num3 + num4);

  }
}