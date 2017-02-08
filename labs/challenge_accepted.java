/*
Joe Tursi
Dr. Rivas
cmpt220
lab2

Make a program that calculates the percentage total grade of a student in this class
and then outputs the corresponding letter grade. The program will ask for a percentage (0 – 100%)
corresponding to each of the four rubrics in this course and will calculate the total final grade for the
student, then, based on the grading policy for this class (here http://www.reev.us/cmpt220s17t/)
you will output the corresponding letter grade.

*/

  public class challenge_accepted{
  	public static void main(String[]args){
  		Scanner input = new Scanner(System.in);
          System.out.print("Please enter the following as a percentage... ");
            int midt = input.nextInt();
              int fexam = input.nextInt();
                int projects = input.nextInt();
                  int hwl = input.nextInt();
                    int avg = (midt + fexam + projects + hwl)/4;
                 
                 if(avg >=90) {
                 	System.out.println("Your final grade is an A")
                 }
                   else if(avg >=80){
                   	System.out.println("Your final grade is a B")
                   }
                     else if(avg >=70){
                     	System.out.println("Your final grade is a C")
                     }
                       else if(avg >=60){
                       	 System.out.println("Your final grade is a D")

                       }
                         else{
                         	System.out.println("Your final grade is a F :(")
                         }
  	}
  }