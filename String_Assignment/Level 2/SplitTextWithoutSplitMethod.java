import java.util.Scanner;
public class SplitTextWithoutSplitMethod {
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
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1;  
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int indexCounter = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[indexCounter++] = i;
            }
        }
        String[] words = new String[wordCount];
     int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i < wordCount - 1) {
                end = spaceIndexes[i];
            } else {
                end = length;
            }
            words[i] = text.substring(start, end);
            start = end + 1;
        }
        return words;
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] userSplit = splitText(input);
        String[] builtInSplit = input.split(" ");
        boolean result = compareArrays(userSplit, builtInSplit);
        System.out.println("\nWords using user-defined method:");
        for (String word : userSplit) {
            System.out.println(word);
        }
        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        System.out.println("\nAre both results equal? " + result);
    }
}
