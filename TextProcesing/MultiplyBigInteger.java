package TextProcesing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstInput = new BigInteger(scanner.nextLine());
        BigInteger secondInput = new BigInteger(scanner.nextLine());

        System.out.println(firstInput.multiply(secondInput));

    }
}
