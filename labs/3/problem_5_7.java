/* 
Joe Tursi
Professor Rivas
CMPT220
LAB3
*/
public class problem_5_7{
  public static void main(String[]args){
  	int tcost = 0; //get total cost for the years of tuition
  	  int tuit = 10000; //init the tuition
  	    int tuittenyear = 1;
  	      for(int year = 1; year <= 14; year++){
  	        tuit +=(tuit *.05); //increase the tuition by .05 a year
  	          if(year > 10) //test 
  	            tcost += tuit; // get the tuition cost
  	              if(year == 10)
  	              	tuittenyear = tuit;
  	                  System.out.println("In ten years tuition will be: " + tuittenyear);
  	                    System.out.println("The total cost for the four years of tuition is: " + tcost);
  	      }
  }
}