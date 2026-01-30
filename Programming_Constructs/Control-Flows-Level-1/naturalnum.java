import java.util.Scanner;
class naturalnum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:-");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("natural number");
		}
		else 
		{
			System.out.println("Not a natural number:");
		}
		System.out.print("Enter a");
		int a=sc.nextInt();
		int sum =a*(a+1)/2;
		System.out.println("Sum =" +sum);
	}
}
