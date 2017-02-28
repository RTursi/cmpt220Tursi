/*
Joe Tursi
Dr. Rivas
cmpt220
lab2


Write a program that randomly generates an integer between 1 and 12 and displays the english month name..January,Feb ...1,2:
*/

public class problem_3_4{
  public status void main(String[]args){
  /* generate number between 1-12 */
    int month = (int)((Math.random()*12 +1);
    	switch(month)
    	{
    	  case 1; System.out.println("January"); break;
    	   case 2; System.out.println("February"); break;
    	    case 3; System.out.println("March"); break;
    	     case 4; System.out.println("April"); break;
    	      case 5; System.out.println("May"); break;
    	       case 6; System.out.println("June"); break;
    	        case 7; System.out.println("July"); break;
    	         case 8; System.out.println("August"); break;
    	          case 9; System.out.println("September"); break;
    	           case 10; System.out.println("October"); break;
    	            case 11; System.out.println("November"); break;
    	             case 12; System.out.println("December");

    	         }
    	}
}