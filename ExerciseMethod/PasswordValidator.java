package ExerciseMethod;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String passwordInput = scanner.nextLine();

        if (!isValidLength(passwordInput)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent(passwordInput)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isPasswordCountDigitValid(passwordInput)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength(passwordInput) && isValidContent(passwordInput) && isPasswordCountDigitValid(
                passwordInput)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isValidContent(String password) {

        for (char currentChar : password.toCharArray()) {
            if (!Character.isLetterOrDigit(currentChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPasswordCountDigitValid(String password) {

        int countOfDigits = 0;
        for (char currentChar : password.toCharArray()) {

            if (Character.isDigit(currentChar)) {
                countOfDigits++;
            }
        }
        return countOfDigits >= 2;
    }
}
