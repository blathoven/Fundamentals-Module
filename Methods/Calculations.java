package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String method = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        doMethod(method, firstNumber, secondNumber);
    }

    public static void doMethod(String method, int firstNumber, int secondNumber) {

        switch (method) {
            case "add":
                System.out.println(firstNumber + secondNumber);
                break;
            case "multiply":
                System.out.println(firstNumber * secondNumber);
                break;
            case "divide":
                System.out.println(firstNumber / secondNumber);
                break;
            case "subtract":
                System.out.println(firstNumber - secondNumber);
        }
    }
}
