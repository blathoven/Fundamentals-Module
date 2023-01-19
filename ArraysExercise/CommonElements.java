package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstElements = scanner.nextLine().split(" ");
        String[] secondElements = scanner.nextLine().split(" ");

        for (int i = 0; i < secondElements.length; i++) {
            for (int j = 0; j < firstElements.length; j++) {
                if (secondElements[i].equals(firstElements[j])) {
                    System.out.printf("%s ", secondElements[i]);
                    break;
                }
            }
        }
    }
}
