package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsGiven = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < commandsGiven; i++) {
            String[] commandArrayed = scanner.nextLine().split(" ");
            String nameOfGuest = commandArrayed[0];
            if (commandArrayed[2].equals("not")) { // {name} is not going!
                if (guestList.contains(nameOfGuest)) {
                    guestList.removeIf(e -> e.equals(nameOfGuest));
                } else {
                    System.out.println(nameOfGuest + " is not in the list!");
                }
            } else { // {name} is going!
                if (guestList.contains(nameOfGuest)) {
                    System.out.println(nameOfGuest + " is already in the list!");
                } else {
                    guestList.add(nameOfGuest);
                }
            }
        }
        for (String currentGuest : guestList) {
            System.out.println(currentGuest);
        }
    }
}
