package TextProcesing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputLine.length; i++) {

            int timesToRepeat = inputLine[i].length();

            for (int j = 0; j < timesToRepeat; j++) {
                sb.append(inputLine[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
