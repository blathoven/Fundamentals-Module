package BasicSyntaxExercises;

import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.parseInt(scanner.nextLine());

        int currentNumb = numb;
        int totalSum = 0;

        while (currentNumb != 0) {

            int divisibleNumb = currentNumb % 10;

            int digitSum = 1;
            for (int i = 2; i <= divisibleNumb ; i++) {
                digitSum *= i;
            }totalSum += digitSum;

            currentNumb /= 10;
        } if (totalSum == numb) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
