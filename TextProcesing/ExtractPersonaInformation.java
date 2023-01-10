package TextProcesing;

import java.util.Scanner;

public class ExtractPersonaInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputCount; i++) {

            char[] inputText = scanner.nextLine().toCharArray();

            StringBuilder name = new StringBuilder();
            StringBuilder years = new StringBuilder();

            for (int j = 0; j < inputText.length; j++) {

                if (inputText[j] == '@') {
                    j++;
                    while (inputText[j] != '|') {
                        name.append(inputText[j]);
                        j++;
                    }
                } else if (inputText[j] == '#') {
                    j++;
                    while (inputText[j] != '*') {
                        years.append(inputText[j]);
                        j++;
                    }
                }
            }
            System.out.printf("%s is %s years old.\n", name, years);
        }
    }
}
