package TextProcesing;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] morseInput = scanner.nextLine().split("\\|");

        StringBuilder decryptedSentence = new StringBuilder();

        for (int i = 0; i < morseInput.length; i++) {

            String[] currentMorseWord = morseInput[i].split(" ");

            for (int j = 0; j < currentMorseWord.length; j++) {
                decryptedSentence.append(getCurrentLetter(currentMorseWord[j]));
            }
            decryptedSentence.append(" ");
        }
        System.out.println(decryptedSentence);
    }

    public static String getCurrentLetter(String morse) {

        String decryptedLetter = "";

        switch (morse) {
            case ".-":
                decryptedLetter = "A";
                break;
            case "-...":
                decryptedLetter = "B";
                break;
            case "-.-.":
                decryptedLetter = "C";
                break;
            case "-..":
                decryptedLetter = "D";
                break;
            case ".":
                decryptedLetter = "E";
                break;
            case "..-.":
                decryptedLetter = "F";
                break;
            case "--.":
                decryptedLetter = "G";
                break;
            case "....":
                decryptedLetter = "H";
                break;
            case "..":
                decryptedLetter = "I";
                break;
            case ".---":
                decryptedLetter = "J";
                break;
            case "-.-":
                decryptedLetter = "K";
                break;
            case ".-..":
                decryptedLetter = "L";
                break;
            case "--":
                decryptedLetter = "M";
                break;
            case "-.":
                decryptedLetter = "N";
                break;
            case "---":
                decryptedLetter = "O";
                break;
            case ".--.":
                decryptedLetter = "P";
                break;
            case "--.-":
                decryptedLetter = "Q";
                break;
            case ".-.":
                decryptedLetter = "R";
                break;
            case "...":
                decryptedLetter = "S";
                break;
            case "-":
                decryptedLetter = "T";
                break;
            case "..-":
                decryptedLetter = "U";
                break;
            case "...-":
                decryptedLetter = "V";
                break;
            case ".--":
                decryptedLetter = "W";
                break;
            case "-..-":
                decryptedLetter = "X";
                break;
            case "-.--":
                decryptedLetter = "Y";
                break;
            case "--..":
                decryptedLetter = "Z";
        }
        return decryptedLetter;
    }
}

