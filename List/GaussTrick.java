package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        numbersInput = numbersCalculated(numbersInput);
        for (int currentDigit : numbersInput) {
            System.out.print(currentDigit + " ");
        }

    }
    public static List<Integer> numbersCalculated(List<Integer> numbersInput) {

        List<Integer> modifiedList = new ArrayList<>();
        for (int i = 0; i < numbersInput.size() / 2; i++) {
            modifiedList.add(numbersInput.get(i) + numbersInput.get((numbersInput.size() - 1) - i));
        }
        if (numbersInput.size() % 2 != 0) {
            modifiedList.add(numbersInput.get(numbersInput.size() / 2));
        }
        return modifiedList;
    }
}
