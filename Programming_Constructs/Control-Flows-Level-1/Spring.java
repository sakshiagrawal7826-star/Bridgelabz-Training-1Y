import java.util.Scanner;
class Spring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Month:-");
		int Month=sc.nextInt();
				System.out.print("Enter Day:-");
		int Day=sc.nextInt();
		if(Month ==3 && Day>=20)
		{
			System.out.println("It is a Spring Season:-");
		}
		else
		{
			System.out.println(" Not a Spring Season:-");
		}
	}
}

			