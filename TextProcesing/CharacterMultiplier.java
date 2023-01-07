package TextProcesing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        System.out.println(getSum(input));
    }
    public static int getSum(String[] input) {

        char[] firstWord = input[0].toCharArray();
        char[] secondWord = input[1].toCharArray();

        boolean firstIsBigger = firstWord.length > secondWord.length;

        int biggerValue = Math.max(firstWord.length, secondWord.length);
        int lowerValue = Math.min(firstWord.length, secondWord.length);

        int sum = 0;

        for (int i = 0; i < lowerValue; i++) {

            sum += firstWord[i] * secondWord[i];

            if (i == lowerValue - 1) {
                for (int j = i + 1; j < biggerValue; j++) {
                    if (firstIsBigger) {
                        sum += firstWord[j];
                    } else {
                        sum += secondWord[j];
                    }
                }
            }
        }
        return sum;
    }
}
