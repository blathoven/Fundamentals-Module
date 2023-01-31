package List;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        List<String> listLine = Arrays.stream(lineInput.split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] commandArrayed = command.split(" ");
            if (command.contains("merge")) {
                StringBuilder mergedElements = new StringBuilder();
                int startIndex = Integer.parseInt(commandArrayed[1]);
                if (startIndex < 0 || startIndex > listLine.size() - 1) {
                    startIndex = 0;
                }
                int endIndex = Integer.parseInt(commandArrayed[2]);
                if (endIndex > listLine.size() - 1 || endIndex < 0) {
                    endIndex = listLine.size() - 1;
                }
                for (int i = startIndex; i <= endIndex; i++) {
                    mergedElements.append(listLine.get(startIndex));
                    listLine.remove(startIndex);
                }
                 listLine.add(startIndex, mergedElements.toString());
            } else if (command.contains("divide")) {
                int divideIndex = Integer.parseInt(commandArrayed[1]);
                int partitions = Integer.parseInt(commandArrayed[2]);
                int partsPerElements = listLine.get(divideIndex).length() / partitions;
                StringBuilder dividedElements = new StringBuilder();
                int elementsAdded = 0;
                int differentParts = 0;
                boolean isFinished = false;
                for (int i = 0; i < listLine.get(divideIndex).length(); i++) {
                    elementsAdded++;
                    dividedElements.append(listLine.get(divideIndex).charAt(i));
                    if (elementsAdded == partsPerElements) {
                        differentParts++;
                        elementsAdded = 0;
                        if (differentParts == partitions) {
                            for (int j = i + 1; j < listLine.get(divideIndex).length(); j++) {
                                dividedElements.append(listLine.get(divideIndex).charAt(j));
                            }
                            isFinished = true;
                        }
                        if (isFinished) {
                            listLine.remove(divideIndex);
                            List<String> separatedList = Arrays.asList(dividedElements.toString().split(" "));
                            listLine.addAll(divideIndex, separatedList);
                            break;
                        }
                        dividedElements.append(" ");
                    }
                }
            }

            command = scanner.nextLine();
        }
        System.out.println(listLine.toString().replaceAll("[\\[\\],]", ""));
    }
}
