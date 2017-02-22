/* 
Joe Tursi
Professor Rivas
CMPT220
LAB3
*/
public class problem_5_12{
  public static void main(String[]args){
    int n = 0;
      while(Math.pow(n, 2)<=12000){
      	while(Math.pow(n, 2)<12000){
      	  n++;
      	}
      System.out.println("The smallest integer n where n^2 is greater than 12,000 is: " +n);
  }
}
}