package TextProcesing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {

            if (text.contains(bannedWord)) {
                text = text.replaceAll(bannedWord, "*".repeat(bannedWord.length()));
            }
        }
        System.out.println(text);
    }
}

