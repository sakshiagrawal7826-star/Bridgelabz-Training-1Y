import java.util.Scanner;
class TriangleArea
{
	public static void main(String args[])
	{
		Scanner sc=new
		Scanner(System.in);
		System.out.print("Enter the base of the triangle in inches: ");
		double base=sc.nextDouble();
		System.out.print("Enter the height of the triangle in inches: ");
		double height = sc.nextDouble();
		double areaInInches = 0.5*base*height;
		double areaInCm = areaInInches*2.54*2.54;
		double heightCm = height*2.54;
		int heightFeet = (int) (height / 12);
		double heightInches = height % 12;
		System.out.println("Area in square inches: " +areaInInches);
		System.out.println("Area in square centimeters: " +areaInCm);
		System.out.println("Height in cm is " +heightCm + "while in feet is " +heightFeet +" and inches is " +height);
	}
}

		