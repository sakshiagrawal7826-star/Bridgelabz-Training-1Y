import java.util.Scanner;
class Sam
{
	public static void main(String args [])
	{
		Scanner sc=new
		Scanner (System.in);
		System.out.print("Enter Maths No:-");
		int a =sc.nextInt();
		System.out.print("Enter Physics No:-");
		int b= sc.nextInt();
		System.out.print("Enter Chemistry No:-");
		int c=sc.nextInt();
		double avg = (a+b+c)/3.0;
		System.out.println("Average marks:-"+avg);
}
}
