package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalWagons = Integer.parseInt(scanner.nextLine());
        int[] totalPassengers = new int[totalWagons];

        int totalSum = 0;
        for (int i = 0; i < totalWagons; i++) {
            totalPassengers[i] += Integer.parseInt(scanner.nextLine());
            totalSum += totalPassengers[i];
        }
        for (int element : totalPassengers) {
            System.out.printf("%d ", element);
        }
        System.out.println();
        System.out.println(totalSum);
    }
}
