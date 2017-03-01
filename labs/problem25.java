/*
JOE TURSI
PROF. RIVAS
SOFTWARE DEV.
LAB 1
problem 2.1
*/
import java.util.Scanner;

public class problem2_5 {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);	
    System.out.print("Enter the subtotal and a gratuity rate: ");
	  double subtotal = input.nextDouble();
	  double gr = input.nextDouble();
		double grat = subtotal * (gr / 100);
		double total = subtotal + grat;
		 System.out.println("The gratuity is " + gratuity +
			" and total is " + total);
	}
}