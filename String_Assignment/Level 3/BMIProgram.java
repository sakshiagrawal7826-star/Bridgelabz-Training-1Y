import java.util.Scanner;

public class BMIProgram {

    public static String[][] calculateBMI(int[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static String[][] processData(int[][] data) {
        return calculateBMI(data);
    }

    public static void display(String[][] arr) {

        System.out.println("\n---------------------------------------------");
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "\t\t" +
                    arr[i][0] + "\t\t" +
                    arr[i][1] + "\t\t" +
                    arr[i][2] + "\t" +
                    arr[i][3]);
        }

        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextInt();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextInt();
        }

        String[][] result = processData(data);

        display(result);

        sc.close();
    }
}