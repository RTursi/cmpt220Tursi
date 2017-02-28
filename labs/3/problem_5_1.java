/*
 Joe Tursi
Professor Rivas
CMPT220
LAB3
*/
import java.util.Scanner;
  public class problem_5_1{
  	public static void main(String[]args){
  	  Scanner input = new Scanner(System.in);
  	    int posnum = 0; // count # of positive nums
  	      int negnum = 0; // count the # num of negative nums
  	        int count = 0;  // count every number
  	         double total = 0; //accumulate a total
              System.out.println("Enter an interger, if 0 is entered this exits");
                int num = input.nextInt();
                  if(num == 0 ){
                  	System.out.println("No numbers are entered except for 0");
                  	System.exit(1);
                  }
                      while(num !=0){
                      	if(num >0)
                      	  posnum++; //positvies increased
                      	else
                      	  negnum++; //neg increased
                      	    total +=num; // get total
                      	      count++;

                      }
                      double avg = total / count;
                        System.out.print("The number of positive numbers is " +posnum + "The number of negatives is " +negnum + "The total" +total+ "The average is " +avg);
  	}
  }