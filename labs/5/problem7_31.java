/* 
JOE TURSI
DR Rivas
cmpt220
lab5

write a test program that prompts the user to enter a series of integers
and displays if the series contains four consecutive numbers with the 
same value. Your program should first prompt the user to enter the inout
size. the number of values in the series...

*/
import java.util.Scanner;
public class problem7_31{
  public static void main(String[]args){
  	Scanner input = new Scanner(System.in);
  	System.out.println("input list1 ");
  	int[] l1 = new int[input.nextInt()];
  	for(int a=0; a<l1.length; a++){
  	 l1[a] = input.nextInt();
  	}
  	System.out.println("input list2 ");
  	int[] l2 = new int[input.nextInt()];
  	for(int a=0; a < l2.length; a++){
  	  l2[a] = input.nextInt();
  	}
  	int[] l3 = merge(l1, l2);

  	System.out.println("The merged list is ");
  	for(int b: list){
  	  System.out.println("" +b);
  	}
  	System.out.println();

}
public static int[] merge(int[] l1, int[] l2){
	int[] l3 = new int[l1.length + l2.length];
	for(int a = 0; a <l1.length; a++)
	  l3[a] = l1[a];
	for(int a = 0; b = l1.length; a < l2.length; a++; b++) { // what is wrong with this??
		l3[b] = l1[a];
	}
	sort(l3);

	return l3;
}

}