package TextProcesing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (int i = 0; i < inputLine.length; i++) {

            String currentSequence = inputLine[i];

            double currentSum = Double.parseDouble(currentSequence.substring(1, currentSequence.length() - 1));

            char firstLetter = currentSequence.charAt(0);
            int firstNumberAlphabetPosition = Character.getNumericValue(firstLetter) - 9;

            char lastLetter = currentSequence.charAt(currentSequence.length() - 1);
            int lastNumberAlphabetPosition = Character.getNumericValue(lastLetter) - 9;

            //checking the first letter.
            if (Character.isUpperCase(firstLetter)) {
                currentSum /= firstNumberAlphabetPosition;
            } else {
                currentSum *= firstNumberAlphabetPosition;
            }
            //checking the last letter.
            if (Character.isUpperCase(lastLetter)) {
                currentSum -= lastNumberAlphabetPosition;
            } else {
                currentSum += lastNumberAlphabetPosition;
            }

            totalSum += currentSum;

        }
        System.out.printf("%.2f", totalSum);
    }
}

