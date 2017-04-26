public class TestBMI{
	public static void main(String[] args) {
		BMI bmi = new BMI("Joe Tursi", 20, 165, 5, 9);
		System.out.println("The BMI for " + bmi.getName() + " is "
			+ bmi.getBMI() + " " + bmi.getStatus());
	}
}