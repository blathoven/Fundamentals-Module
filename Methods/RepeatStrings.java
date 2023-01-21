package Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordInput = scanner.nextLine();
        int repeatingCountInput = Integer.parseInt(scanner.nextLine());

        String finalWord = printRepeatedString(wordInput, repeatingCountInput);

        System.out.println(finalWord);

    }
    public static String printRepeatedString(String currentWord, int repeatingCount) {

        String wordRepeated = "";

        for (int i = 0; i < repeatingCount; i++) {
            wordRepeated += currentWord;
        }
        return wordRepeated;
    }
}
