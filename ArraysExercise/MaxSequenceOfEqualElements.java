package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int mostTimes = 0;
        int theDigit = 0;

        for (int currentDigit = 0; currentDigit < numbers.length; currentDigit++) {

            int currentStreak = 0;

            for (int nextDigits = currentDigit + 1; nextDigits < numbers.length; nextDigits++) {

                if (numbers[currentDigit] == numbers[nextDigits]) {
                    currentStreak++;
                } else {
                    break;
                }
            }
            if (currentStreak > mostTimes) {
                mostTimes = currentStreak;
                theDigit = numbers[currentDigit];
            }
        }
        for (int i = 0; i <= mostTimes; i++) {

            System.out.print(theDigit + " ");

        }
    }
}
