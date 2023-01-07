package TextProcesing;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder ints = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {
                ints.append(input.charAt(i));
            } else if (Character.isLetter(input.charAt(i))) {
                letters.append(input.charAt(i));
            } else {
                symbols.append(input.charAt(i));
            }
        }
        System.out.println(ints);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
