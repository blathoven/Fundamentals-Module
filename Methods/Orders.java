package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantityOfProduct = Integer.parseInt(scanner.nextLine());

        printTotalPrice(product, quantityOfProduct);

    }
    public static void printTotalPrice(String product, int quantityOfProduct) {
        double totalPrice = 0;
        switch (product) {
            case "coffee":
                totalPrice = quantityOfProduct * 1.50;
                break;
            case "water":
                totalPrice = quantityOfProduct * 1.00;
                break;
            case "coke":
                totalPrice = quantityOfProduct * 1.40;
                break;
            case "snacks":
                totalPrice = quantityOfProduct * 2.00;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
