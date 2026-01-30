class Discount
{
	public static void main(String args[])
	{
		int fee=125000;
		int discountpercent=10;
		int discount=(fee*discountpercent)/100;
		int finalfee = fee-discount;
		System.out.println("The discount amount is INR"+discount);
		System.out.println("The final discounted fee is INR"+finalfee);
	}
}
