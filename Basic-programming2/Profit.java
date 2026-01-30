import java.util.Scanner;
class Profit
{
	public static void main(String args[])
	{
		Scanner sc=new 
		Scanner(System.in);
		System.out.print("Enter Cost Price:-");
		int a=sc.nextInt();
		System.out.print("Enter Selling Price:-");
		int b =sc.nextInt();
		double profit =b-a;
		System.out.println("profit:-"+profit);
		double Profit_Percentage =(profit*100)/a;
		System.out.println("ProfitPercentage:-"+Profit_Percentage);
	}
}
