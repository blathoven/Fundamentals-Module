package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            List<Integer> listLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                    .collect(Collectors.toList());
            List<Integer> specialNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                    .collect(Collectors.toList());

            int bombNumber = specialNumbers.get(0);
            int powerNumber = specialNumbers.get(1);

            for (int i = 0; i < listLine.size(); i++) { // rightNumbers
                if (listLine.get(i).equals(bombNumber)) {
                    for (int j = 0; j < powerNumber; j++) {
                        if (i + 1 > listLine.size() - 1) {
                            break;
                        } else {
                            listLine.remove(i + 1);
                        }
                    }
                }
            }
            for (int i = 0; i < listLine.size(); i++) { // leftNumbers
                if (listLine.get(i).equals(bombNumber)) {
                    for (int j = 0; j < powerNumber; j++) {
                        if (i - 1 < 0) {
                            break;
                        } else {
                            listLine.remove(i - 1);
                            i--;
                        }
                    }
                }
            }
            listLine.removeIf(e -> e.equals(bombNumber));
            int totalSum = 0;
            for (int currentDigit : listLine) {
                totalSum += currentDigit;
            }
            System.out.println(totalSum);
    }
}
