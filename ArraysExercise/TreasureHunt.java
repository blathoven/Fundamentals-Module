package ArraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] currentAction = command.split(" ");

            switch (currentAction[0]) {
                case "Loot":

                    for (int currentItemIndex = 1; currentItemIndex < currentAction.length; currentItemIndex++) {
                        boolean itemContained = false;
                        for (int treasureChestItemIndex = 0; treasureChestItemIndex <
                                treasureChest.length; treasureChestItemIndex++) {

                            if (currentAction[currentItemIndex].equals(treasureChest[treasureChestItemIndex])) {
                                itemContained = true;
                                break;
                            }
                        }
                        if (!itemContained) {
                            String newChest = currentAction[currentItemIndex] + " " + String.join(" ",
                                    treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;

                case "Drop":

                    int dropInteger = Integer.parseInt(currentAction[1]);
                    if (dropInteger >= 0 && dropInteger < treasureChest.length) {
                        String droppedItem = treasureChest[dropInteger];
                        for (int i = dropInteger; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = droppedItem;
                    } else {
                        break;
                    }
                    break;

                case "Steal":

                    int totalStolenItems = Integer.parseInt(currentAction[1]);

                    if (totalStolenItems >= 0 && totalStolenItems < treasureChest.length) {

                        for (int i = 0; i < totalStolenItems; i++) {

                            System.out.print(treasureChest[treasureChest.length - totalStolenItems + i]);
                            if (i != totalStolenItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] temporaryChest = new String[treasureChest.length - totalStolenItems];

                        for (int i = 0; i < temporaryChest.length; i++) {
                            temporaryChest[i] = treasureChest[i];
                        }
                        treasureChest = temporaryChest;
                    } else if (totalStolenItems >= 0) {
                        for (int i = 0; i < treasureChest.length; i++) {
                            System.out.print(treasureChest[i]);
                            if (i != treasureChest.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasureChest = new String[0];
                    }
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();
        }
        String treasureCount = String.join("", treasureChest);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }
        double averageTreasure = (1.0 * charCounter) / treasureChest.length;

        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}



