package TextProcesing;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequenceOfNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();

        while (true) {

            String inputLine = scanner.nextLine();

            if (inputLine.equals("find")) {
                break;
            }

            StringBuilder decryptedCode = new StringBuilder();
            int decreasingNumber = 0;

            for (int i = 0; i < inputLine.length(); i++) {

                char currentChar = (char) (inputLine.charAt(i) - sequenceOfNumbers[decreasingNumber]);
                decryptedCode.append(currentChar);

                if (decreasingNumber == sequenceOfNumbers.length - 1) {
                    decreasingNumber = 0;
                } else {
                    decreasingNumber++;
                }
            }

            //Searching for the type:

            int startIndexTreasureType = decryptedCode.toString().indexOf("&") + 1;
            int endIndexTreasureType = decryptedCode.toString().lastIndexOf("&");

            String treasureType = decryptedCode.toString().substring(startIndexTreasureType, endIndexTreasureType);

            //Searching for the coordinates:

            int startIndexCoordinates = decryptedCode.toString().indexOf("<") + 1;
            int endIndexCoordinates = decryptedCode.toString().lastIndexOf(">");

            String coordinates = decryptedCode.toString().substring(startIndexCoordinates, endIndexCoordinates);

            //Printing:

            System.out.printf("Found %s at %s\n", treasureType, coordinates);

        }
    }
}
