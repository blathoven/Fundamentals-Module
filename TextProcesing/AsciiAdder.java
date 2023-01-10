package TextProcesing;

import java.util.Scanner;

public class AsciiAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstInputLine = scanner.nextLine().charAt(0);
        char secondInputLine = scanner.nextLine().charAt(0);

        int higherValue = Math.max(firstInputLine, secondInputLine);
        int lowerValue = Math.min(firstInputLine, secondInputLine);

        char[] randomStringInCharacters = scanner.nextLine().toCharArray();

        int sum = 0;

        for (int i = 0; i < randomStringInCharacters.length; i++) {

            if (randomStringInCharacters[i] > lowerValue && randomStringInCharacters[i] < higherValue) {
                sum += randomStringInCharacters[i];
            }
        }
        System.out.println(sum);
    }
}
