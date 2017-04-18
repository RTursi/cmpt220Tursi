/* 
JOE TURSI
DR RIVAS
CMPT220
LAB6

*/
public class Rectangle{
  double height;  //can;t be int because of the stupid decimal 
  double width;   // same here
    Rectangle(){ 
      height = 1;
      width = 1;

  }
  Rectangle(double newHeight, double newWidth){  // n here omgggg
  	height = newHeight; 
  	width = newWidth;
  }
   double getPerimeter(){   //yep you guessed it
  	return (height + width)*2;
  }
  double getArea(){   // and here we done
  	return width * height;
  }
 
}