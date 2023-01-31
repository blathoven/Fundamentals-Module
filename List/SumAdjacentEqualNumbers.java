package List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> lineInput = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < lineInput.size() - 1; i++) {

            if (lineInput.get(i).equals(lineInput.get(i + 1))) {
                lineInput.set(i, lineInput.get(i) + lineInput.get((i + 1)));
                lineInput.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(printElementByDelimiter(lineInput, " "));
    }
    public static String printElementByDelimiter(List<Double> list, String delimiter) {

        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double currentElement : list) {

            String currentString = df.format(currentElement) + delimiter;
            result += currentString;

        }
        return result;
    }
}
