/* 
Joe Tursi
Professor Rivas
CMPT220
LAB3

/*
(Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
integer n such that n3 is less than 12,000.
*/
public class problem_5_13{
  public static void main(String[]args){
    int n = 0;
      while(Math.pow(n + 1, 3) <12,000){
      	n++; // add to n
      }
      System.out.println("The largest n such that n^3 is less than 12,000 is: " +n);
  }
}