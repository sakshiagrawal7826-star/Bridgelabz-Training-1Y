import java.util.Scanner;
public class SplitText2DArray {
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
    public static String[][] create2DArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] result = create2DArray(words);
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[1][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
    }
}
}