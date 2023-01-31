package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
            boolean firstIsTheWinner = false;
            for (int i = 0; i < firstPlayerLine.size(); i++) {
                if (isNotLeftWithoutCars(secondPlayerLine)) {
                    firstIsTheWinner = true;
                    break;
                }
                if (firstPlayerLine.get(i) > secondPlayerLine.get(i)) {
                    firstPlayerLine.add(firstPlayerLine.get(i));
                    firstPlayerLine.add(secondPlayerLine.get(i));
                    firstPlayerLine.remove(i);
                    secondPlayerLine.remove(i);
                    i = -1;
                } else if (secondPlayerLine.get(i) > firstPlayerLine.get(i)) {
                    if (isNotLeftWithoutCars(firstPlayerLine)) {
                        break;
                    }
                    secondPlayerLine.add(secondPlayerLine.get(i));
                    secondPlayerLine.add(firstPlayerLine.get(i));
                    secondPlayerLine.remove(i);
                    firstPlayerLine.remove(i);
                    i = -1;
                } else {
                    if (isNotLeftWithoutCars(firstPlayerLine) || isNotLeftWithoutCars(secondPlayerLine)) {
                        break;
                    }
                    firstPlayerLine.remove(i);
                    secondPlayerLine.remove(i);
                    i = -1;
                }
            }
            int totalAmountOfPoints = 0;
            if (firstIsTheWinner) {
                for (int currentDigit : firstPlayerLine) {
                    totalAmountOfPoints += currentDigit;
                }
                System.out.println("First player wins! Sum: " + totalAmountOfPoints);
            } else {
                for (int currentDigit : secondPlayerLine) {
                    totalAmountOfPoints += currentDigit;
                }
                System.out.println("Second player wins! Sum: " + totalAmountOfPoints);
            }
        }
        public static boolean isNotLeftWithoutCars(List<Integer> playerListLine) {
        return playerListLine.size() == 0;
        }
    }

