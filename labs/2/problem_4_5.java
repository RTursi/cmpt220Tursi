/*
Joe Tursi
Dr. Rivas
cmpt220
lab2

(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in 
which all sides are of the same length and all angles have the same degree (i.e., the 
polygon is both equilateral and equiangular). The formula for computing the area 
of a regular polygon is
Area = n x s^2/ 4 x tan(pi/n)
*/
import java.util.Scanner;
  public class problem_4_5{
    public static void main(String[]args){
    	Scanner input = new Scanner(System.in);
    	  System.out.println("Enter a length of a side of a polygon" );
    	    double s = input.nextDouble();
    	      double area = (6 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/6));
    	        System.out.println("The area of the polygon is " + area);
    }
  }