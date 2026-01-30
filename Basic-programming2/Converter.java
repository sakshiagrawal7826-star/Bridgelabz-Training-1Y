import java.util.Scanner;
class Converter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in Kilometers:-");
		double km=sc.nextDouble();
		double Miles=km*0.621371;
		System.out.println("Convert Miles into Kilometers:-"+Miles);
	}
}
