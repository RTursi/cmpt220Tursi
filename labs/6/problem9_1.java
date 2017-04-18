/* 
JOE TURSI
DR RIVAS
CMPT220
LAB6

*/

public class problem9_1{
public static void main(String[]args){
  Rectangle rectangle1 = new Rectangle(4, 40);  // create rectangle width of 4 height of 40
  Rectangle rectangle2 = new Rectangle(3.5, 35.9);
//display the attributes
  System.out.println("rectangle 1");
  System.out.println("height = " + rectangle1.height);
  System.out.println("width = " + rectangle1.width);
  System.out.println("perimeter = " +rectangle1.getPerimeter());
  System.out.println("area = " + rectangle1.getArea());

  System.out.println("rectangle 2");
  System.out.println("height = " + rectangle2.height);
  System.out.println("width = " + rectangle2.width);
  System.out.println("perimeter = " + rectangle2.getPerimeter());
  System.out.println("area = " +rectangle2.getArea());
  	  

  }
}