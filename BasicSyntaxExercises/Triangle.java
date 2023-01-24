package BasicSyntaxExercises;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startLetter = scanner.nextLine();
        String endLetter = scanner.nextLine();
        String forbiddenLetter = scanner.nextLine();

        int startLetterDigit = startLetter.charAt(0);
        int endLetterDigit = endLetter.charAt(0);
        int forbiddenLetterDigit = forbiddenLetter.charAt(0);
        int totalCombinations = 0;

        for (int i = startLetterDigit; i <= endLetterDigit ; i++) {
            for (int j = startLetterDigit; j <= endLetterDigit ; j++) {
                for (int k = startLetterDigit; k <= endLetterDigit ; k++) {
                    System.out.printf("%c%c%c ", i, j, k);
                    totalCombinations++;

                }
            }
        }
        System.out.println(totalCombinations);

    }
}
