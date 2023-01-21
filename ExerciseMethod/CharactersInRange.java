package ExerciseMethod;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstInput = scanner.nextLine().charAt(0);
        char secondInput = scanner.nextLine().charAt(0);

        getCharacterLines(firstInput, secondInput);
    }

    public static void getCharacterLines(char first, char second) {

        int biggerValue = Math.max(first, second);
        int lowerValue = Math.min(first, second);

        for (int i = lowerValue + 1; i < biggerValue; i++) {
            int firstInt = (char) i;
            System.out.printf("%c ", firstInt);

        }
    }
}
