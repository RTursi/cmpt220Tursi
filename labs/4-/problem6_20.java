/*
Joe Tursi
Dr. Rivas
CMPT220
Lab 4
Write a method that counts the number of letters in 
a string using the following header:


*/
import java.util.Scanner;
  public class problem6_20{ // original method
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
        System.out.println("Enter le string "); //prompt the user
          String lestring = input.nextLine(); //

          System.out.println("Amount of letters are " +lestring.length());
         }
            public static int countLetters(String s){
              int letters = 0; //have 0 letters initially, until entered
                for(int l=0; l < s.length(); l++){
                	letters++;
                }
                return letters;

  }
}

//WORKS LETS GOOOOO 1/4 