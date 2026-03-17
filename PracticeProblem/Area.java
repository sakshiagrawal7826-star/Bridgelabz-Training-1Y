 import java.util.Scanner;
 public class Area{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;    
       System.out.println("Area of Circle : "+area);
     }
 }