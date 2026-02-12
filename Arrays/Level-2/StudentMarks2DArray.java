import java.util.Scanner;
public class StudentMarks2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3]; 
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0)
                        System.out.print("Enter Physics marks: ");
                    else if (j == 1)
                        System.out.print("Enter Chemistry marks: ");
                    else
                        System.out.print("Enter Maths marks: ");

                    marks[i][j] = sc.nextDouble();

                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Marks must be between 0 and 100!");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 40) {
                grade[i] = "Pass";
            } else {
                grade[i] = "Fail";
            }
        }

        System.out.println("\n--- STUDENT RESULT ---");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade     : " + grade[i]);
            System.out.println();
        }
    }
}