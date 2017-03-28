/* 
JOE TURSI
DR Rivas
cmpt220
lab5
(Partition of a list) Write the following method that partitions the list using the 
first element, called a pivot.
public static int partition(int[] list)
After the partition, the elements in the list are rearranged so that all the elements 
before the pivot are less than or equal to the pivot and the elements after the pivot 
are greater than the pivot. The method returns the index where the pivot is located 
in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition, the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes 
at most list.length comparisons. Write a test program that prompts the user 
to enter a list and displays the list after the partition. Here is a sample run. Note 
that the first number in the input indicates the number of the elements in the list. 
This number is not part of the list.

*/
import java.util.Scanner;
public class problem7_32{
  public static void main(String[]args){
  	Scanner input = new Scanner(System.in);

  	
  	System.out.print("Enter the list: ");

  	int elements = input.nextInt();
  	int[] list = new int[elements];
  	  for(int a = 0; a < elements; a++)
  	  	list[a] = input.nextInt();
  	  partition(list);

  }
  public static int partition(int[] list){
  	int start = 0;
  	int sec = start + 1;
  	int big = list.length -1;
  	int small = list[start];
  	  while(big > small){
  	  	if(big> small){
  	  	  int temp = list[big];
  	  	  list[big]= list[small];
  	  	  list[small] = temp;
  	  	}

  	  }
  	  while(big >= small) big--;
  	  	return start; // THIS is impossible to debug....
  }   // 3 cups of coffee later, compiles!
  // 4 cups of coffee later, doesn't return the partition
  
}