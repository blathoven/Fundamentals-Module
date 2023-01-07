package TextProcesing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String finalString = scanner.nextLine();

        int length = firstInput.length();

        while (true) {

            String updatedString = "";
            int index = finalString.indexOf(firstInput);
            int lastIndex = index + length - 1;
            if (index == -1) {
                break;
            } else {
                for (int i = 0; i < finalString.length(); i++) {
                    if (i >= index && i <= lastIndex) {
                    } else {
                        updatedString += finalString.charAt(i);
                    }
                }
            }
            finalString = updatedString;
        }
        System.out.println(finalString);
    }
}
