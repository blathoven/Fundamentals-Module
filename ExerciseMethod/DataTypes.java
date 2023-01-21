package ExerciseMethod;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();

        switch (commandInput) {
            case "int":
                int currentDigit = Integer.parseInt(scanner.nextLine());
                printModifiedResult(currentDigit);
                break;
            case "real":
                double currentRealDigit = Double.parseDouble(scanner.nextLine());
                printModifiedResult(currentRealDigit);
                break;
            case "string":
                String textInput = scanner.nextLine();
                printModifiedResult(textInput);
        }

    }

    public static void printModifiedResult(int digit) {
        System.out.println(digit * 2);
    }

    public static void printModifiedResult(double digit) {
        System.out.printf("%.2f", digit * 1.5);
    }

    public static void printModifiedResult(String text) {
        System.out.printf("$%s$", text);
    }
}
