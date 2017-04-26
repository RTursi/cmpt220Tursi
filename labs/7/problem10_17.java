/* 
Joe Tursi
Dr Rivas
cmpt220tursi
lab 7 
(square numbers) Find the first ten square numbers that are greater than Long.MAX_VALUE. 
A square number is a number in the form of n^2. Find an efficient approach to run your program 
fast.
*/ 
import java.math.BigInteger;
public class problem10_17 {
public static void main(String[] args) {
  BigInteger i = new BigInteger(Long.MAX_VALUE + "  "); 
  BigInteger end = i.add(new BigInteger("10"));
// Display results
  for (i = new BigInteger(Long.MAX_VALUE + "  "); 
    i.compareTo(end) <= 0; 
	i = i.add(new BigInteger("1"))) {
	System.out.println(i.multiply(i)); 
	}		
  }
}