/*
Joe Tursi
Dr. Rivas
CMPT220
Lab 4

write a method that finds the smallest element in an array of double values using the following
header;
public static double min(double[]array)

Write a test program that prompts the uder to enter ten numbers, invokes this method to return the minimum value,
 and displays the minimum value    
*/
import java.util.Scanner;
  public class problem7_9{
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
        double[] num = new double[10]; //array with ten numbers
          System.out.println("Enter ten numbers please "); //ask for the digits 
            for(int n =0; n < num.length; n++){	
            	num[n] = input.nextDouble();
            }
              System.out.println("Minimum value is" +(num));
   }
   public static double min(double[]array){
   	double min = array[0];
   	  for(double n: array) {
   	    if(n <= min)
   	      min = n;
   	  }
      return min;
   }
}

//entered the numbers 1-10 and said minimum value is [D@2503dbd3 
// works but doesnt el oh el