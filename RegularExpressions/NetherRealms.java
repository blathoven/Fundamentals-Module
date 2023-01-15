package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(",");

        Pattern patternLetters = Pattern.compile("[A-Za-z]");

        Pattern patternDigits = Pattern.compile("[+-]?\\d+(\\.\\d+)?");

        Pattern patternMathSymbols = Pattern.compile("[\\*\\/]");


        for (String currentDemon : inputLine) {

            currentDemon = currentDemon.replaceAll(" ", "");

            int health = 0;
            double damage = 0;

            Matcher matcherLetters = patternLetters.matcher(currentDemon);
            while (matcherLetters.find()) {

                health += matcherLetters.group().charAt(0);
            }

            Matcher matcherDigits = patternDigits.matcher(currentDemon);
            while (matcherDigits.find()) {
               damage = damage + (Double.parseDouble(matcherDigits.group()));
            }


            Matcher matcherMathSymbols = patternMathSymbols.matcher(currentDemon);
            while (matcherMathSymbols.find()) {
                if (matcherMathSymbols.group().equals("/")) {
                    damage /= 2;
                } else if (matcherMathSymbols.group().equals("*")) {
                    damage *= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage\n", currentDemon,
                    health, damage);
        }
    }
}
