package ExerciseMethod;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());

        methodSyntax(firstDigit, secondDigit, thirdDigit);

    }

    public static void methodSyntax(int first, int second, int third) {
        if (first == 0 || second == 0 || third == 0) {
            System.out.println("zero");
        } else if (first < 0 || second < 0 || third < 0) {
            int countOfNegatives = 0;

            if (first < 0) {
                countOfNegatives++;
            }
            if (second < 0) {
                countOfNegatives++;
            }
            if (third < 0) {
                countOfNegatives++;
            }
            if (countOfNegatives == 2) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }

        } else {
            System.out.println("positive");
        }
    }
}
