package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String returnType = scanner.nextLine();
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        char firstSymbolReturnType = returnType.charAt(0);

        if (firstSymbolReturnType == 'i') {
            print(firstLine, secondLine);
        } else if (firstSymbolReturnType == 's') {
            print(firstLine, secondLine);
        } else if (firstSymbolReturnType == 'c') {
            print(firstLine, secondLine);
        }

    }

    public static void print(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }

    public static void print(String firstString, String secondString) {

        if (firstString.compareTo(secondString) >= 0) {
            System.out.println(firstString);
        } else {
            System.out.println(secondString);
        }

    }

    public static void print(char firstChar, char secondChar) {

        if (firstChar > secondChar) {
            System.out.println(firstChar);
        } else {
            System.out.println(secondChar);
        }
    }
}
