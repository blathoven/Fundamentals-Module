package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String commandInput = scanner.nextLine();

        while (!commandInput.equals("End")) {
            String[] commandArrayed = commandInput.split(" ");
            switch (commandArrayed[0]) {
                case "Add":
                    listLine.add(Integer.parseInt(commandArrayed[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(commandArrayed[2]) < 0 || Integer.parseInt(commandArrayed[2]) >
                    listLine.size() - 1) {
                        System.out.println("Invalid index");
                        break;
                    }
                    listLine.add(Integer.parseInt(commandArrayed[2]), Integer.parseInt(commandArrayed[1]));
                    break;
                case "Remove":
                    if (Integer.parseInt(commandArrayed[1]) < 0 || Integer.parseInt(commandArrayed[1]) >
                    listLine.size() - 1) {
                        System.out.println("Invalid index");
                        break;
                    }
                    listLine.remove(Integer.parseInt(commandArrayed[1]));
                    break;
                case "Shift":
                    if (commandArrayed[1].equals("left")) {
                        for (int i = 0; i < Integer.parseInt(commandArrayed[2]); i++) {
                            listLine.add(listLine.get(0));
                            listLine.remove(0);
                        }
                    } else {
                        for (int i = 0; i < Integer.parseInt(commandArrayed[2]); i++) {
                            listLine.add(0, listLine.get(listLine.size() - 1));
                            listLine.remove(listLine.size() - 1);
                        }
                    }
            }
            commandInput = scanner.nextLine();
        }
        System.out.println(listLine.toString().replaceAll("[\\[\\],]", ""));
    }
}
