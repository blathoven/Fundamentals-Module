package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitInput = Integer.parseInt(scanner.nextLine());

        inputLines(digitInput);

    }
    public static void inputLines(int digitInput) {
        for (int i = 1; i <= digitInput ; i++) {
            lineNumbers(1, i);
        }
        for (int i = digitInput - 1; i >= 1; i--) {

            lineNumbers(1, i);

        }
    }
    public static void lineNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {

            System.out.print(i + " ");
        }
        System.out.println();
    }
}

