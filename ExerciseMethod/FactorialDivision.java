package ExerciseMethod;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberInput = Integer.parseInt(scanner.nextLine());
        int secondNumberInput = Integer.parseInt(scanner.nextLine());

        long firstNumber = getFirstFactorialDivision(firstNumberInput);
        long secondNumber = getFirstFactorialDivision(secondNumberInput);

        double result = firstNumber * 1.0 / secondNumber;
        System.out.printf("%.2f", result);
    }

    public static long getFirstFactorialDivision(int firstNumber) {

        long result = 1;

        for (int i = 1; i <= firstNumber; i++) {
            result *= i;
        }
        return result;
    }
}
