/* 
JOE TURSI
DR RIVAS
CMPT220
LAB6

*/

import java.util.Scanner;
public class problem9_13{
  public static void main(String[]args){
  	//scanner
  	Scanner input = new Scanner(System.in);
  	//enter the rows/columns
  	System.out.println("Enter the # of rows and columns in the array ");
  	  int rows = input.nextInt();
  	  int columns = input.nextInt();
  	  

  	  double[][] array = new double[rows][columns];  //array for attribs.
  	  System.out.println("Enter array");
  	  for(int i = 0; i < array.length; i++){
  	  	for(int j = 0; j < array[i].length; j++){
  	  	  array[i][j] = input.nextDouble();
  	  	}
  	  }
  	  location max = locateLargest(array);
  	  System.out.print("largest element is" +max.maxValue + "at" + max.row + max.column);


  }
   public static location locateLargest(double[][] c){
   return new location(c);
  	
  }

}
