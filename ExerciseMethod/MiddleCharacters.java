package ExerciseMethod;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        getMiddleCharacter(textInput);
    }

    public static void getMiddleCharacter(String text) {

        int middleIndex = (text.length() / 2);
        if (text.length() % 2 == 0) {
            System.out.println(text.charAt(middleIndex - 1) + "" + text.charAt(middleIndex));
        } else {
            System.out.println(text.charAt(middleIndex));
        }


    }
}
