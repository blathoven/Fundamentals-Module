package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumNumber = Integer.parseInt(scanner.nextLine());

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {

            for (int nextDigits = currentIndex + 1; nextDigits < numbers.length; nextDigits++) {

                if (numbers[currentIndex] + numbers[nextDigits] == sumNumber) {
                    System.out.printf("%d %d%n", numbers[currentIndex], numbers[nextDigits]);
                }
            }
        }
    }
}
