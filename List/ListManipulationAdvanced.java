package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String commandLine = scanner.nextLine();

        while (!commandLine.equals("end")) {
            String[] commandSeparated = commandLine.split(" ");
            switch (commandSeparated[0]) {
                case "Contains":
                    int numberToVerify = Integer.parseInt(commandSeparated[1]);
                    if (listLine.contains(numberToVerify)) {
                        System.out.print("Yes");
                    } else {
                        System.out.print("No such number");
                    }
                    break;
                case "Print":
                    if (commandSeparated[1].equals("even")) {
                        for (int i = 0; i < listLine.size(); i++) {
                            if (listLine.get(i) % 2 == 0) {
                                System.out.print(listLine.get(i) + " ");
                            }
                        }
                    } else if (commandSeparated[1].equals("odd")) {
                        for (int i = 0; i < listLine.size(); i++) {
                            if (listLine.get(i) % 2 != 0) {
                                System.out.print(listLine.get(i) + " ");
                            }
                        }
                    }
                    break;
                case "Get":
                    int sumOfAllNumbers = 0;
                    for (int i = 0; i < listLine.size(); i++) {
                        sumOfAllNumbers += listLine.get(i);
                    }
                    System.out.print(sumOfAllNumbers);
                    break;
                case "Filter":
                    int numberProvided = Integer.parseInt(commandSeparated[2]);
                    char charSum = 0;
                    for (int i = 0; i < commandSeparated[1].length(); i++) {
                        charSum += commandSeparated[1].charAt(i);
                    }
                    if (charSum == 62) { // >
                        for (int i = 0; i < listLine.size(); i++) {
                            if (listLine.get(i) > numberProvided) {
                                System.out.print(listLine.get(i) + " ");
                            }
                        }
                    } else if (charSum == 60) { // <
                        for (int i = 0; i < listLine.size(); i++) {
                            if (listLine.get(i) < numberProvided) {
                                System.out.print(listLine.get(i) + " ");
                            }
                        }
                    } else if (charSum == 121) { // <=
                        for (int i = 0; i < listLine.size(); i++) {
                            if (listLine.get(i) <= numberProvided) {
                                System.out.print(listLine.get(i) + " ");
                            }
                        }
                    } else if (charSum == 123) { // >=
                        for (int i = 0; i < listLine.size(); i++) {
                            if (listLine.get(i) >= numberProvided) {
                                System.out.print(listLine.get(i) + " ");
                            }
                        }
                    }
            }
            System.out.println();
            commandLine = scanner.nextLine();
        }
    }
}
