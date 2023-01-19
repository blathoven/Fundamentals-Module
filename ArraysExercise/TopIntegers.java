package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String highestNumbers = "";
        boolean isLower = false;

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {

            isLower = false;

            for (int nextNumber = currentIndex + 1; nextNumber < numbers.length; nextNumber++) {

                if (numbers[currentIndex] <= numbers[nextNumber]) {
                    isLower = true;
                    break;
                }
            }
            if (!isLower) {
                highestNumbers += numbers[currentIndex] + " ";
            }
        }
        System.out.println(highestNumbers);
    }
}
