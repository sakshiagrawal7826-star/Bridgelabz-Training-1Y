import java.util.Scanner;
public class CharacterFrequencyb {
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] unique = new char[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < index; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index] = ch;
                index++;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }
    public static String[][] frequency(String text) {

        int[] freq = new int[256];  
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] output = frequency(text);
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + " : " + output[i][1]);
        }
    }
}
