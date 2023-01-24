package BasicSyntaxExercises;

import java.util.Scanner;

public class HappyDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= digit ; i++) {
            for (int j = 1; j <= digit ; j++) {
                for (int k = 1; k <= digit ; k++) {
                    for (int l = 1; l <= digit ; l++) {

                        if (i + j == k + l && digit % (i + j) == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);

                        }

                    }
                }
            }
        }
    }
}
