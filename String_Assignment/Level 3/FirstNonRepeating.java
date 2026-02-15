import java.util.Scanner;
public class FirstNonRepeating {
    public static char findFirstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                return str.charAt(i);
            }
        }
        return '\0';  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char result = findFirstNonRepeating(input);
        if (result == '\0')
            System.out.println("No non-repeating character found.");
        else
            System.out.println("First non-repeating character: " + result);
    }
}
