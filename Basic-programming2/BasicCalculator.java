import java.util.Scanner;
class BasicCalculator {
	public static void main(String args [])
	{
		double number1;
		double number2;
		double add,sub,mul,div;
		Scanner sc = new
		Scanner(System.in);
		System.out.println("Enter first number:");
		number1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		number2 = sc.nextDouble();
		add = number1+number2;
		sub = number1-number2;
		mul = number1*number2;
		div = number1/number2;
		System.out.println("The addition value is "+add);
		System.out.println("The subtraction value is "+sub);
		System.out.println("The multiplication value is "+mul);
		System.out.println("The division value is "+div);
	}
}