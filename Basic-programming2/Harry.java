import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner sc=new
		Scanner(System.in);
		System.out.print("Enter Birth Year:-");
		int a =sc.nextInt();
		System.out.print("Enter Current Year:-");
		int b=sc.nextInt();
		int age= b-a;
		System.out.println("Age of Harry:-" +age);
	}
}
