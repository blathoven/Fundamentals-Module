package TextProcesing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decryptedText = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < decryptedText.length(); i++) {

                encryptedText.append((char) (decryptedText.charAt(i) + 3));

        }
        System.out.println(encryptedText);
    }
}

