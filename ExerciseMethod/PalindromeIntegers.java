package ExerciseMethod;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palindromeNumberInput = scanner.nextLine();

        while (!palindromeNumberInput.equals("END")) {

            String currentNumber = getPalindrome(palindromeNumberInput);

            if (currentNumber.equals(palindromeNumberInput)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            palindromeNumberInput = scanner.nextLine();
        }
    }

    public static String getPalindrome(String number) {

        StringBuilder currentNumber = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {

            currentNumber.append(number.charAt(i));

        }
        return currentNumber.toString();
    }
}
