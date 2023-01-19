package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");
            if (!commandParts[0].equals("decrease")) {
                int firstNumb = Integer.parseInt(commandParts[1]);
                int secondNumb = Integer.parseInt(commandParts[2]);

                if (commandParts[0].equals("swap")) {
                    int savedNumb = numbers[firstNumb];

                    numbers[firstNumb] = numbers[secondNumb];
                    numbers[secondNumb] = savedNumb;
                } else if (commandParts[0].equals("multiply")) {

                    numbers[firstNumb] = numbers[firstNumb] * numbers[secondNumb];

                }
            } else {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
