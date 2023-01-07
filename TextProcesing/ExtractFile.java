package TextProcesing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        int indexOfLastBackslash = inputLine.lastIndexOf('\\') + 1;

        String[] fileNameAndExtension = inputLine.substring(indexOfLastBackslash).replace('.', ' ')
                .split("\\s+");

        System.out.printf("File name: %s\n" +
                "File extension: %s", fileNameAndExtension[0], fileNameAndExtension[1]);

    }
}
