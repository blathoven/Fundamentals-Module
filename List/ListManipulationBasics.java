package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listInput = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String currentCommand = scanner.nextLine();

        while (!currentCommand.equals("end")) {
            String[] commandSplit = currentCommand.split(" ");
            switch (commandSplit[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandSplit[1]);
                    listInput.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandSplit[1]);
                    listInput.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandSplit[1]);
                    listInput.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandSplit[1]);
                    int toIndex = Integer.parseInt(commandSplit[2]);
                    listInput.add(toIndex, numberToInsert);
            }
            currentCommand = scanner.nextLine();
        }
        System.out.println(listInput.toString().replaceAll("[\\[\\],]",""));
    }
}