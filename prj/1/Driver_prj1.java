/* 
Joe Tursi
Dr. Rivas
Cmpt220
proj1
*/
import java.util.Scanner;
public class Driver_prj1{
  public static void main(String[]args){
  	Scanner input = new Scanner(System.in);
  	System.out.println("Input2");
  	  int a = input.nextInt();
  	  double[] ar1 = new double[a];

  	System.out.println("Input2");
  	  int b = input.nextInt();
  	  double[] ar2 = new double[b];

  	for(int h=0; h<ar1.length; h++){
  	  ar1[h] = input.nextDouble();
  	}
  	for(int k = 0; k <ar2.length; k++){
  	  ar2[k] = input.nextDouble();
  	}

  	double[] cResult = workorCRY(ar1, ar2);
  	System.out.print("Vector3 is: ");
  	for(int h = 0; h < cResult.length; h++){
  	  System.out.print((int) cResult[h] + "");
  	}

    
  }
	public static double[] workorCRY(double[] vFirst, double[] vSecond) {
    double[] cResult = new double[(vFirst.length + vSecond.length) - 1];
    for (int h = 0; h < cResult.length; h++) {
      for (int shift = 0; shift < vSecond.length ; shift++) {
        try {
          cResult[h] += (vFirst[h - shift] * vSecond[shift]); 
        } 
        catch (IndexOutOfBoundsException e) {
        }
      }
    }
    return cResult; 
  } 
}