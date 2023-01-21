package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentDigit = Integer.parseInt(scanner.nextLine());

        digitType(currentDigit);

    }
    public static void digitType(int mainDigit) {

        if (mainDigit > 0) {
            System.out.printf("The number %d is positive.", mainDigit);
        } else if (mainDigit < 0) {
            System.out.printf("The number %d is negative.", mainDigit);
        } else {
            System.out.printf("The number %d is zero.", mainDigit);
        }
    }
}

