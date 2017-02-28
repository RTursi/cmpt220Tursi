/*
Joe Tursi
Dr. Rivas
cmpt220
lab2

Write a program that prompts the user to enter the length from the center of a pentagon to a vertex
 and computes the area of the pentagon, as shown in th efollowing figure.
 */
 import java.util.Scanner;
   public class problem_4_1{
     public static void main(String[]args){
     	Scanner input = new Scanner(System.in);
     	  System.out.println("Enter the length from the center of the vertex");
     	    double radius = input.nextDouble();
     	      double s =(2 * radius) * Math.sin(Math.PI/5) // side formula\\
     	        double area = (5 * Math.pow(s, 2))/(4 x Math.tan(Math.PI/5));
     	          System.out.println("The area of the pentagon is: " +area);
     }
   }