package TextProcesing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")) {
            char[] currentStringCharred = inputLine.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (int i = currentStringCharred.length - 1; i >= 0; i--) {
                sb.append(currentStringCharred[i]);
            }

            System.out.println(inputLine + " = " + sb.toString());

            inputLine = scanner.nextLine();
        }
    }
}
