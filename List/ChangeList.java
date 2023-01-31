package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArrayed = command.split(" ");
            switch (commandArrayed[0]) {
                case "Delete":
                    int elementsToDelete = Integer.parseInt(commandArrayed[1]);
                    listLine.removeIf(e -> e.equals(elementsToDelete));
                    break;
                case "Insert":
                    int elementToInsert = Integer.parseInt(commandArrayed[1]);
                    int toIndex = Integer.parseInt(commandArrayed[2]);
                    listLine.add(toIndex, elementToInsert);
            }
            command = scanner.nextLine();
        }
        System.out.println(listLine.toString().replaceAll("[\\[\\],]", ""));
    }
}
