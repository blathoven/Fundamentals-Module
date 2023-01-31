package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listLine = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int removedNumbersSum = 0;
        while (listLine.size() > 0) {
            int removedItem;
            int currentIndexInput = Integer.parseInt(scanner.nextLine());
            if (currentIndexInput < 0) {
                removedItem = listLine.get(0);
                listLine.remove(0);
                listLine.add(0, listLine.get(listLine.size() - 1));
            } else if (currentIndexInput > listLine.size() - 1) {
                removedItem = listLine.get(listLine.size() - 1);
                listLine.remove(listLine.size() - 1);
                listLine.add(listLine.get(0));
            } else {
                removedItem = listLine.get(currentIndexInput);
                listLine.remove(currentIndexInput);
            }
            removedNumbersSum += removedItem;
            for (int i = 0; i < listLine.size(); i++) {
                if (listLine.get(i) > removedItem) {
                    listLine.set(i, listLine.get(i) - removedItem);
                } else {
                    listLine.set(i, listLine.get(i) + removedItem);
                }
            }
        }
        System.out.println(removedNumbersSum);
    }
}
