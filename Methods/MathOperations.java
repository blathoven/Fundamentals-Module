package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumberInput = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNumberInput = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        double result = 0;

        switch (operator) {
            case '/':
                result = getResultOfDivide(firstNumberInput, secondNumberInput);
                break;
            case '*':
                result = getResultOfMultiply(firstNumberInput, secondNumberInput);
                break;
            case '+':
                result = getResultOfPlus(firstNumberInput, secondNumberInput);
                break;
            case '-':
                result = getResultOfSubtraction(firstNumberInput, secondNumberInput);
            }

        System.out.println(df.format(result));

        }
        public static double getResultOfDivide(double firstNumb, double secondNumb) {
        return firstNumb / secondNumb;
        }
        public static double getResultOfMultiply(double firstNumb, double secondNumb) {
        return firstNumb * secondNumb;
        }
        public static double getResultOfPlus(double firstNumb, double secondNumb) {
        return firstNumb + secondNumb;
        }
        public static double getResultOfSubtraction(double firstNumb, double secondNumb) {
        return firstNumb - secondNumb;
        }
    }

