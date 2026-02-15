import java.util.Scanner;
public class ShortestLongestWord {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] splitWords(String text) {
        int len = findLength(text);
        String[] temp = new String[len];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                if (!word.equals("")) {
                    temp[wordIndex++] = word;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            temp[wordIndex++] = word;
        }
        String[] words = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) {
            words[i] = temp[i];
        }
        return words;
    }
    public static String[][] create2DArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);
        }
        return result;
    }
    public static int[] findShortestLongest(String[][] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            int currentLength = Integer.parseInt(arr[i][1]);
            int minLength = Integer.parseInt(arr[minIndex][1]);
            int maxLength = Integer.parseInt(arr[maxIndex][1]);
            if (currentLength < minLength) {
                minIndex = i;
            }
            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] result = create2DArray(words);
        int[] indexes = findShortestLongest(result);
        System.out.println("\nShortest Word: " + 
            result[indexes[0]][0] + 
            " (Length: " + Integer.parseInt(result[indexes[0]][1]) + ")");
        System.out.println("Longest Word: " + 
            result[indexes[1]][0] + 
            " (Length: " + Integer.parseInt(result[indexes[1]][1]) + ")");
    }
}
