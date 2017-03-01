/*
Joe Tursi
Dr. Rivas
CMPT220
Lab 4

(Bubble sort)wirte a sort method that uses the bubble-sort algorithm.
The bubble sort algorithm makes several passes through the array. On each pass, successive
neighboring pairs are compared. If a pair is not in order, its values are swapped; otherwise, the
values remain unchanged. The technique is called a bubble sort or sinking sort because the smaller the 
values gradually "bubble" their way to the top and the larger values "sink" to the bottom. Write a test 
program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
*/

import java.util.Scanner;
  public class  problem7_18{
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
        double[] nums = new double[10]; // array with 10 numbers
          System.out.println("Enter ten numbers ");
            for(int a = 0; a< nums.length; a++)
              nums[a] = input.nextDouble();
                bubbleSort(nums); //int bubblesort
                 for(double s: nums) {  //display the nums that are sorted
                 	System.out.println(s +" ");
                 }
         }
public static void bubbleSort(double[]list){
  double sort;
  for(int a = 0; a <list.length - 1;a++)
  	if(list[a] >list[a+1]){
  		sort = list[a];
  	}
}

}

//Work in progress eff this