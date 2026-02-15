import java.util.Scanner;
import java.util.Random;
public class StudentScoreCard {
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = rand.nextInt(90) + 10; 
            marks[i][1] = rand.nextInt(90) + 10;
            marks[i][2] = rand.nextInt(90) + 10; 
        }
        return marks;
    }
    public static double[][] calculateResults(int[][] marks) {
        int students = marks.length;
        double[][] result = new double[students][3]; 
        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }
    public static String[] calculateGrade(double[][] result) {
        int students = result.length;
        String[] grades = new String[students];
        for (int i = 0; i < students; i++) {
            double percentage = result[i][2];
            if (percentage >= 90)
                grades[i] = "A+";
            else if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    public static void displayScoreCard(int[][] marks, double[][] result, String[] grades) {
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grades[i]);
        }
        System.out.println("---------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] marks = generateMarks(students);
        double[][] result = calculateResults(marks);
        String[] grades = calculateGrade(result);
        displayScoreCard(marks, result, grades);
    }
}
