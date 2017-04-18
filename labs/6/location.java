/* 
JOE TURSI
DR RIVAS
CMPT220
LAB6

*/
public class location{  // class location
  int row;
  int column;
  double maxValue;

  location(double[][] c){
  	maxValue = c[0][0];
  	row = 0;
  	column = 0;	
  	for(int i = 0; i< c.length; i++){
  	  for(int j =0; j <c[i].length; j++){
  	  	if(c[i][j] > maxValue){
  	  		maxValue = c[i][j];
  	  		row = i;
  	  		column = j;
  	  	}
  	  }
  	}
  }
  
}