package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isEqual = false;

        for (int i = 0; i < numbers.length; i++) {

            int rightSum = 0;
            int leftSum = 0;

            for (int leftIndex = 0; leftIndex < i; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = i + 1; rightIndex < numbers.length; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (rightSum == leftSum) {
                isEqual = true;
                System.out.print(i);
                break;
            }
        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}
