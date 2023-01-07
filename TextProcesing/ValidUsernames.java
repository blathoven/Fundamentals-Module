package TextProcesing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("\\s+");

        System.out.println(getSum(inputLine[0], inputLine[1]));

    }
    public static int getSum(String firstWord, String secondWord) {

        int sum = 0;

        for (int i = 0; i < firstWord.length() || i < secondWord.length(); i++) {

            if (i < firstWord.length() && i < secondWord.length()) {
                sum += firstWord.charAt(i) * secondWord.charAt(i);
            } else if (i < firstWord.length()) {
                sum += firstWord.charAt(i);
            } else {
                sum += secondWord.charAt(i);
            }
        }
        return sum;
    }
}
