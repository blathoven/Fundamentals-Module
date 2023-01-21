package ExerciseMethod;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = Integer.parseInt(scanner.nextLine());

        printTheActualNumbers(numberInput);

    }
    public static int printNumbers(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } if (number == 3) {
            return 2;
        } else {
            return printNumbers(number - 1) +
                   printNumbers(number - 2) +
                   printNumbers(number - 3);
        }
    }
    public static void printTheActualNumbers(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.print(printNumbers(i) + " ");
        }
    }
}
