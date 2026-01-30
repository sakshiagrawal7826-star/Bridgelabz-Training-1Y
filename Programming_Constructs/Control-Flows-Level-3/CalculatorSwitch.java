import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {

        double first, second;
        String op;

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter first number: ");
        first = sc.nextDouble();

        System.out.print("Enter second number: ");
        second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();

        int number = 2;  

      
        for (int i = 1; i < number; i++) {

            switch (op) {
                case "+":
                    System.out.println("Result = " + (first + second));
                    break;

                case "-":
                    System.out.println("Result = " + (first - second));
                    break;

                case "*":
                    System.out.println("Result = " + (first * second));
                    break;

                case "/":
                    if (second != 0) {
                        System.out.println("Result = " + (first / second));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

                default:
                    System.out.println("Invalid Operator");
            }
        }

        sc.close();
    }
}
