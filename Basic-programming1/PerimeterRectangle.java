import java.util.Scanner;
class PerimeterRectangle
{
	public static void main(String args [])
	{
		Scanner sc=new
		Scanner(System.in);
		System.out.print("Enter lenght: ");
		int l=sc.nextInt();
		System.out.print("Enter breadth:");
		int b=sc.nextInt();
		int perimeter=2*(l+b);
		System.out.println("Perimeter of Rectangle="+perimeter);
	}
}
