/* 
Joe Tursi
Dr Rivas
cmpt220tursi
lab 7 
Construct a BMI with the specified name, age, weight, feet and inches

*/ 

public class BMI {
private String name;
private int age;
private double weight;  
private double height;  
public static final double KILOGRAMSPPOUND = 0.45359237;
public static final double METERPINCH = 0.0254;
public static final int INCH_PER_FOOT = 12;

public BMI(String name, int age, double weight, double height) {
this.name = name;
this.age = age;
this.height = height;
this.weight = weight;
}

public BMI(String name, double weight, double height) {
  this(name, 20, weight, height);
}
  /** Construct a BMI with the specified name, age, weight,
  * feet, and inches
  */
public BMI(String name, int age, double weight, double feet,
  double inches) {
  this(name, age, weight, inches + feet * 12);
}
public double getBMI() {
  double bmi = weight * KILOGRAMSPPOUND /
  ((height * METERPINCH) * (height *  METERPINCH));
  return Math.round(bmi * 100) / 100.0;
}
public String getStatus() {
  double bmi = getBMI();
  if (bmi < 18.5)
  return "LIGHTWEIGHT!";
  else if (bmi < 25)
  return "SHREDZ BRUH!";
  else if (bmi < 30)
  return "CHUBBY";
  else
  return "SIGNUPFORGYM";
}
public String getName() {
  return name;
}

public int getAge() {
return age;
  }

public double getWeight() {
  return weight;
}
  
public double getHeight() {
  return height;
  }
}