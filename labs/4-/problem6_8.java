/*
Joe Tursi
Dr. Rivas
CMPT220
Lab 4

(Conversions between Celsius and Fahrenheit) Write a class that contains the following
	two methods:

	public static double celsiusToFahrenheit(double celsius)
	public static double fahrenheitToCelsius(double fahrenheit)

*/
public class problem6_8{
  public static void main(String[]args){
    System.out.println("Celsius      Fahrenheit     |    Fahrenheit     Celsius");
      for(double celsius =40, fahrenheit = 120; celsius =31;){
        System.out.println(celsius);
        System.out.println(celsiusToFahrenheit(celsius));
        System.out.println(fahrenheit);
        System.pout.println(fahrenheitToCelsius(fahrenheit));
      }
  }
}

  	
public static double celsiusToFahrenheit(double celsius){
  return (9.0 / 5) * celsius + 32;
}


public static double fahrenheitToCelsius(double fahrenheit){
 return (5.0 / 9) * (fahrenheit – 32);
}
 



//3 errors this one is possible 