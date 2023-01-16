package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern emailPattern = Pattern.compile("(^|(?<=\\s))(([a-zA-Z0-9]+)([\\.\\-_]?)" +
                "([A-Za-z0-9]+)(@)([a-zA-Z]+([\\.\\-][A-Za-z]+)+))(\\b|(?=\\s))");

        String inputLine = scanner.nextLine();

        Matcher emailMatcher = emailPattern.matcher(inputLine);

        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }
    }
}
