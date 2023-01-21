package Methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstNumberInput = Double.parseDouble(scanner.nextLine());
        double secondNumberInput = Double.parseDouble(scanner.nextLine());

        double result = mathPower(firstNumberInput, secondNumberInput);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }
    public static double mathPower(double firstNumber, double poweredNumber) {

        double result = 1;

        for (int i = 1; i <= poweredNumber; i++) {

            result = result * firstNumber;

        }

        return result;
    }
}
