import java.util.Scanner;
public class StringLengthWithoutLengthMethod {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int userLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("\nLength using user-defined method: " + userLength);
        System.out.println("Length using built-in length() method: " + builtInLength);
    }
}
