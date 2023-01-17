package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[^\\-@!:>]*@(?<name>[A-Z][a-z]*)[^\\-@!:>]*!(?<behavior>[GN])!");

        int key = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();

        List<String> goodKids = new ArrayList<>();
        while (!inputLine.equals("end")) {
            StringBuilder decryptedMessage = new StringBuilder();

            for (int i = 0; i < inputLine.length(); i++) {
                char decryptedChar = (char) (inputLine.charAt(i) - key);
                decryptedMessage.append(decryptedChar);
            }

            Matcher matcher = pattern.matcher(decryptedMessage.toString());

           if (matcher.find()) {
               if (matcher.group("behavior").equals("G")) {
                   goodKids.add(matcher.group("name"));
               }
           }

            inputLine = scanner.nextLine();
        }

        goodKids.forEach(System.out::println);

    }
}
