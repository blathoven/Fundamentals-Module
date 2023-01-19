package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int command = Integer.parseInt(scanner.nextLine());
        int[] firstLine = new int[command];
        int[] secondLine = new int[command];

        for (int row = 1; row <= command; row++) {
            String currentElements = scanner.nextLine();
            int firstElement = Integer.parseInt(currentElements.split(" ")[0]);
            int secondElement = Integer.parseInt(currentElements.split(" ")[1]);

            if (row % 2 == 0) {
                firstLine[row - 1] = secondElement;
                secondLine[row - 1] = firstElement;
            } else {
                firstLine[row - 1] = firstElement;
                secondLine[row - 1] = secondElement;
            }
        }

        for (int number : firstLine) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondLine) {
            System.out.print(number + " ");
        }
    }
}
