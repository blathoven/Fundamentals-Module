package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile(">>(?<product>[A-Za-z]+)<<(?<price>\\d+(\\.\\d+)?)!(?<quantity>\\d+\\b)");

        List<String> purchases = new ArrayList<>();

        double totalSum = 0;
        while (true) {
            String inputLine = scanner.nextLine();

            if (inputLine.equals("Purchase")) {
                break;
            }

            Matcher matcher = pattern.matcher(inputLine);

            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                totalSum += price * quantity;

                purchases.add(matcher.group("product"));
            }
        }
        System.out.println("Bought furniture:");
        for (String currentFurniture : purchases) {
            System.out.println(currentFurniture);
        }
        System.out.printf("Total money spend: %.2f", totalSum);;
    }
}
