package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> allWagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArrayed = command.split(" ");
            if (commandArrayed[0].equals("Add")) {
                int newWagonPassengersCount = Integer.parseInt(commandArrayed[1]);
                allWagons.add(newWagonPassengersCount);
            } else {
                int passengersToFit = Integer.parseInt(commandArrayed[0]);
                for (int i = 0; i < allWagons.size(); i++) {
                    if (allWagons.get(i) + passengersToFit <= maxCapacityOfEachWagon) {
                        int totalPassengers = allWagons.get(i) + passengersToFit;
                        allWagons.set(i, totalPassengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(allWagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
