package Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scanner.nextLine());

        gradeSign(gradeInput);

    }
    public static void gradeSign(double currentGrade) {
        if (currentGrade >= 2 && currentGrade < 3) {
            System.out.println("Fail");
        } else if (currentGrade >= 3 && currentGrade < 3.50) {
            System.out.println("Poor");
        } else if (currentGrade >= 3.50 && currentGrade < 4.50) {
            System.out.println("Good");
        } else if (currentGrade >= 4.50 && currentGrade < 5.50) {
            System.out.println("Very good");
        } else if (currentGrade >= 5.50 && currentGrade <= 6) {
            System.out.println("Excellent");
        }
    }
}


