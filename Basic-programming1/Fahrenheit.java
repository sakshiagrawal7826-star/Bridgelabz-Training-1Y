import java.util.Scanner;
class Fahrenheit
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println( "Enter temperaturein Celsius:");
	int Celsius=sc.nextInt();
	double fahrenheit=(Celsius*9/5)+32;
	System.out.println("Convert Celsius into Fahrenheit:-" +fahrenheit);
}
}
