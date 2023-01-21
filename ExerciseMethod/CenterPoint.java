package ExerciseMethod;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        if (theClosestPoint(x1, y1, x2, y2)) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
    public static boolean theClosestPoint(int x1, int y1, int x2, int y2) {

        boolean firstPointsCloser = false;

        if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) {
            int x1Rounded = Math.abs(x1);
            int y1Rounded = Math.abs(y1);
            int x2Rounded = Math.abs(x2);
            int y2Rounded = Math.abs(y2);

            if (x1Rounded + y1Rounded < x2Rounded + y2Rounded) {
                firstPointsCloser = true;
            } else if (x1Rounded + y1Rounded == x2Rounded + y2Rounded) {
                firstPointsCloser = true;
            }
        } else if (x1 + y1 < x2 + y2) {
            firstPointsCloser = true;
        } else if (x1 + y1 == x2 + y2) {
            firstPointsCloser = true;
        }

        return firstPointsCloser;

    }
}
