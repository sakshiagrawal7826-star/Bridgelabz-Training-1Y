import java.util.Scanner;
class Volume
{
	
     public static void main(String args[])
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter h:-");
	 int h=sc.nextInt();
	 System.out.println("Enter r:-");
	 int r=sc.nextInt();
	 double Volume=3.14*r*r*h;
     System.out.println("Volume Of Cylinder:-"+Volume); 
   }
}

	
	