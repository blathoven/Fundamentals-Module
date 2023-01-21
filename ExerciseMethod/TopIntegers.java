package ExerciseMethod;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        isNumberTopInteger(numberInput);
    }

    public static void isNumberTopInteger(int number) {

        for (int i = 1; i <= number; i++) {

            boolean isOdd = false;
            int currentDigit = i;
            int sumOfDigits = 0;

            while (currentDigit != 0) {

                int modifiedDigit = currentDigit;
                modifiedDigit %= 10;
                sumOfDigits += modifiedDigit;

                if (modifiedDigit % 2 != 0) {
                    isOdd = true;
                }
                currentDigit /= 10;
            }
            if (sumOfDigits % 8 == 0 && isOdd) {
                System.out.println(i);
            }
        }
    }
}
