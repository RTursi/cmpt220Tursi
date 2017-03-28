/* 
JOE TURSI
DR Rivas
cmpt220
lab5

The selection-sort method repeatedly finds the smallest number in the current array and waps it 
with the first. rewrite this program by finding the largest number and
swapping it with the last. Write a test program that reads in ten double
numbers, invokes le method, and displays the sorted numbers.
*/

import java.util.Scanner;
public class problem7_20{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  double[] num = new double[10];

  System.out.println("Enter ten numbers");
  for(int  a=0; a< num.length; a++)
  num[a] = input.nextDouble();
  
  selectionSort(num);
  for(double b: num)
    System.out.println(b + "");
	System.out.println();

  }

  public static void selectionSort(double[] list){
  	for(int a =list.length - 1; a >= 0; a--){
  		double max = list[a];
  		int maxIndex = a;

  		for(int c = a -1; c >= 0; c--){
  		 if(max < list[c]){
  		 	max = list[c];
  		 	maxIndex = c;
  		 }
  		}

  	}

  }
  
}