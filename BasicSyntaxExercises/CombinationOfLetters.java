package BasicSyntaxExercises;

import java.util.Scanner;

public class CombinationOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());

        int totalDigits = 0;

        for (int i = 1; i <= numb1 ; i++) {
            if (i % 2 == 0) {
                for (int j = 2; j <= numb2 ; j++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        for (int k = 1; k <= numb3 ; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d %n", i, j, k);
                            }
                        }
                    }
                }

            }
        }
    }
}
