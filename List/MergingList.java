package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int shorterList = Math.min(firstList.size(), secondList.size());

        List<Integer> modifiedList = new ArrayList<>();
        for (int i = 0; i < shorterList; i++) {
            modifiedList.add(firstList.get(i));
            modifiedList.add(secondList.get(i));
        }
        if (firstList.size() > secondList.size()) {
            modifiedList.addAll((firstList.subList(shorterList, firstList.size())));
        } else if (secondList.size() > firstList.size()) {
            modifiedList.addAll(secondList.subList(shorterList, secondList.size()));
        }
        System.out.println(modifiedList.toString().replaceAll("[\\[\\],]", ""));
    }
}

// if (i == firstList.size() - 1) {
//         for (int j = i + 1; j < secondList.size(); j++) {
//        modifiedList.add(secondList.get(j));
//        }
//        isFinished = true;
//        } else if (i == secondList.size() - 1) {
//        for (int j = i + 1; j < firstList.size(); j++) {
//        modifiedList.add(firstList.get(j));
//        }
//        isFinished = true;
//        }
//        if (isFinished) {
//        break;
//        }
//        }
//        for (int currentNumber : modifiedList) {
//        System.out.print(currentNumber + " ");
//        }
