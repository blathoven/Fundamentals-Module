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


//        int command = Integer.parseInt(scanner.nextLine());
//        int[] firstLine = new int[command];
//        int[] secondLine = new int[command];
//
//        for (int i = 0; i < command; i++) {
//            int[] currentElements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
//                    .toArray();
//
//            if (i % 2 == 0) {
//                firstLine[i] += currentElements[0];
//                secondLine[i] += currentElements[1];
//            } else {
//                firstLine[i] += currentElements[1];
//                secondLine[i] += currentElements[0];
//            }
//        }
//
//        for (int fLine : firstLine) {
//            System.out.printf("%d ", fLine);
//        }
//        System.out.println();
//        for (int sLine : secondLine) {
//            System.out.printf("%d ", sLine);
//        }