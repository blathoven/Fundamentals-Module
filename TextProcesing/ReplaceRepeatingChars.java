package TextProcesing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder charactersModified = new StringBuilder();

        String inputLine = scanner.nextLine();
        char[] inputArrayed = inputLine.toCharArray();
        for (int i = 0; i < inputArrayed.length; i++) {
            if (i == inputArrayed.length - 1) {
                charactersModified.append(inputArrayed[i]);
            } else if (inputArrayed[i] != inputArrayed[i + 1]) {
                charactersModified.append(inputArrayed[i]);
            }
        }
        System.out.println(charactersModified);
    }
}
