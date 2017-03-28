/* 
JOE TURSI
DR Rivas
cmpt220
lab5


*/

import java.util.Scanner;

public class problem8_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();

		double[][] array = new double[row][column];

		System.out.println("Enter the array:");
		for (int z = 0; z < array.length; z++) {
		  for (int b = 0; b < array[z].length; b++) {
		  array[z][b] = input.nextDouble();
			}
		}

        int[] location = locateLargest(array);

		System.out.println("The location of the largest element is at (" +
		location[0] + ", " + location[1] + ")");
	}


	public static int[] locateLargest(double[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double max = 0;
		for (int z = 0; z < a.length; z++) {
		for (int b = 0; b < a[z].length; b++) {
		if (a[z][b] > max) {
		  l[0] = z;
		  l[1] = b;
		  max = a[z][b];
				}
			}
		}
		return l;
	}
}