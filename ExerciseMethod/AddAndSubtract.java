package ExerciseMethod;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        int thirdInput = Integer.parseInt(scanner.nextLine());

        int finalResult = getAddResult(firstInput, secondInput, thirdInput);
        System.out.println(finalResult);
    }
    public static int getAddResult(int first, int second, int third) {
        int result = first + second;
        result -= getSubtractResult(third);
        return result;
    }
    public static int getSubtractResult(int third) {
        return third;
    }
}
