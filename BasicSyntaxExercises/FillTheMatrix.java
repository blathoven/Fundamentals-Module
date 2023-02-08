package MultiDimensionalArraysExercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split(", ");
        int dimensions = Integer.parseInt(inputLine[0]);

        int[][] matrix = new int[dimensions][];

        if (inputLine[1].equals("A")) {
            matrix = readMatrixA(dimensions);
        } else {
            matrix = readMatrixB(dimensions);
        }

        printMatrix(matrix);

    }
    public static int[][] readMatrixA(int dimension) {
        int[][] matrix = new int[dimension][dimension];

        int index = 1;
        for (int col = 0; col < dimension; col++) {

            for (int row = 0; row < dimension; row++) {

                matrix[row][col] = index;

                index++;
            }
        }
        return matrix;
    }

    public static int[][] readMatrixB(int dimension) {
        int[][] matrix = new int[dimension][dimension];

        int index = 1;
        for (int col = 0; col < dimension; col++) {

            for (int row = 0; row < dimension; row++) {

                if (col % 2 != 0) {
                    matrix[dimension - row - 1][col] = index;
                } else {
                    matrix[row][col] = index;
                }
                index++;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int currentElement : row) {
                System.out.print(currentElement + " ");
            }
            System.out.println();
        }
    }
}
