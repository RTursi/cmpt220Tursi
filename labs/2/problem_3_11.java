/*
Joe Tursi
Dr. Rivas
cmpt220
lab2

(Find the number of days in the month)Write a program that prompts the user to enter the month and year and displays the  number of days in the month. 
For example, if the user entered month 2 and year 2012, the program should display that February 2012 had 29 days. 
If the user entered month 3 and year 2015, the program should display that March 2015 had 31 days

*/
import java.util.Scanner;
  public class problem_3_11{
  	public static void main(String[]args){
  	  Scanner input = new Scanner(System.in);
  	  //User enters month and hyear
  	    System.out.println("Enter a month as an integer ");
  	      int month = input.nextInt();
  	        System.out.println("Enter a year as an integer ");
  	          int year = input.nextInt();
  	            boolean leap = (year % 4 == 0  && % 100 != 0 )|| (year %400 == 0);
  	              switch(month){
  	              	case 1: System.out.println("January" + year + "had 31 days"); break;
  	              	  case 2: System.out.println("February" + year + "had 31 days"); break;
  	              	    case 3: System.out.println("March" + year + "had 31 days"); break;
  	              	      case 4: System.out.println("April" + year + "had 30 days"); break;
  	              	        case 5: System.out.println("May" + year + "had 31 days"); break;
  	              	          case 6: System.out.println("June" + year + "had 30 days"); break;
  	              	            case 7: System.out.println("July" + year + "had 31 days"); break;
  	              	              case 8: System.out.println("August" + year + "had 31 days"); break;
  	              	                case 9: System.out.println("September" + year + "had 30 days"); break;
  	              	                  case 10: System.out.println("October" + year + "had 31 days"); break;
  	              	                    case 11: System.out.println("November" + year + "had 30 days"); break;
  	              	                      case 12: System.out.println("December" + year + "had 31 days"); break;
  	              }
  	}
  }