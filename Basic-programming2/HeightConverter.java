import java.util.Scanner;
class HeightConverter {
	public static void main(String args[])
	{
		double heightCm;
		double totalInches;
		int feet;
		double inches;
		Scanner sc = new 
		Scanner(System.in);
		System.out.print("Enter your height in centimeters: ");
		heightCm = sc.nextDouble();
		totalInches = heightCm / 2.54;
		feet = (int) (totalInches / 12);
		inches = totalInches % 12;
		System.out.println("Your height in cm is" +heightCm + "while in feet is " +feet + "and inches is " +inches);
	}
}