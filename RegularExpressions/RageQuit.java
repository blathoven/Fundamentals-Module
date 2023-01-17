package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<string>[\\D]*)(?<count>\\d+)");
        Matcher matcher = pattern.matcher(input);

        StringBuilder modifiedString = new StringBuilder();

        while (matcher.find()) {
            int repeatCount = Integer.parseInt(matcher.group("count"));
            String word = matcher.group("string").toUpperCase();

            for (int i = 0; i < repeatCount; i++) {
                modifiedString.append(word);
            }
        }
        System.out.printf("Unique symbols used: %d\n", modifiedString.chars().distinct().count());
        System.out.println(modifiedString);
    }
}
