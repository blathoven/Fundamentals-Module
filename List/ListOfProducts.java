package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            productList.add(scanner.nextLine());
        }

        Collections.sort(productList);

        for (int i = 0; i < productList.size(); i++) {

            System.out.printf("%d.%s%n", i + 1, productList.get(i));

        }
    }
}
