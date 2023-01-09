package TextProcesing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int explosionPower = 0;

        StringBuilder modifiedInput = new StringBuilder();

        for (int i = 0; i < inputLine.length(); i++) {

            if (inputLine.charAt(i) == '>') {
                modifiedInput.append(inputLine.charAt(i));
                explosionPower += inputLine.charAt(i + 1) - '0';
            } else if (explosionPower > 0) {
                explosionPower--;
            } else {
                modifiedInput.append(inputLine.charAt(i));
            }
        }
        System.out.println(modifiedInput);
    }
}
