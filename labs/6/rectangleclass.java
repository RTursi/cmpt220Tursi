/* 
JOE TURSI
DR RIVAS
CMPT220
LAB6

*/
public class Rectangle{
  int height;
  int width;
    Rectangle(){
      height = 1;
      width = 1;

  }
  Rectangle(int newHeight, int newWidth){
  	height = newHeight;
  	width = newWidth;
  }
   int getPerimeter(){
  	return (height + width)*2;
  }
  int getArea(){
  	return width * height;
  }
 
}