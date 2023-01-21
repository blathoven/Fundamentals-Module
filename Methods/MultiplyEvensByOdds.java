package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());
        int result = multiplyEvenAndOddNumbers(numberInput);
        System.out.println(result);

    }
    public static int multiplyEvenAndOddNumbers(int number) {

        int evenSum = getResultOfEvenSum(number);
        int oddSum = getResultOfOddSum(number);

        return evenSum * oddSum;
    }

    public static int getResultOfEvenSum(int number) {

        int evenSum = 0;
        int currentNumber = number;

        while (currentNumber != 0) {

            int processingNumber = currentNumber;
            processingNumber %= 10;
            if (processingNumber % 2 == 0) {
                evenSum += processingNumber;
            }
            currentNumber /= 10;
        }
        return evenSum;
    }

    public static int getResultOfOddSum(int number) {

        int oddSum = 0;
        int currentNumber = number;

        while (currentNumber != 0) {

            int processingNumber = currentNumber;
            processingNumber %= 10;

            if (processingNumber % 2 != 0) {
                oddSum += processingNumber;
            }
            currentNumber /= 10;
        }
        return oddSum;
    }
}

