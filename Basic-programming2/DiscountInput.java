import java.util.Scanner;
class DiscountInput
{
	public static void main(String args[])
	{
	double fee;
	double discountpercent;
	double discount;
	double finalfee;
	Scanner sc=new
	Scanner(System.in);
	System.out.print("Enter student fee:");
	fee = sc.nextDouble();
	System.out.print("Enter discount percentage:");
	discountpercent = sc.nextDouble();
	discount = (fee*discountpercent)/100;
	finalfee = fee-discount;
	System.out.println("the discount amount is INR:-" +discount);
	System.out.println("The final discountedfee is INR:-" +finalfee);
	sc.close();
}
}
