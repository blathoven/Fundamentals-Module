package ExerciseMethod;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandArrayed = command.split(" ");

            switch (commandArrayed[0]) {
                case "exchange":
                    int index = Integer.parseInt(commandArrayed[1]);

                    if (index > arrayInput.length - 1 || index < 0) {
                        System.out.println("Invalid index");
                    } else {

                        arrayInput = exchange(arrayInput, index);

                    }
                    break;
                case "max":

                    if (commandArrayed[1].equals("odd")) {
                        printMaxOddIndex(arrayInput);
                    } else {
                        printMaxEvenIndex(arrayInput);
                    }
                    break;
                case "min":

                    if (commandArrayed[1].equals("odd")) {
                        printMinOddIndex(arrayInput);
                    } else {
                        printMinEvenIndex(arrayInput);
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(commandArrayed[1]);
                    String firstOddOrEven = commandArrayed[2];
                    if (firstOddOrEven.equals("odd")) {
                        printFirstOddDigits(arrayInput, count);
                    } else {
                        printFirstEvenDigits(arrayInput, count);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commandArrayed[1]);
                    String lastOddOrEven = commandArrayed[2];

                    if (lastOddOrEven.equals("odd")) {
                        printLastOddDigits(arrayInput, countLast);
                    } else {
                        printLastEvenDigits(arrayInput, countLast);
                    }
            }
            command = scanner.nextLine();
        }
        System.out.print("[");

        for (int i = 0; i < arrayInput.length; i++) {

            if (i != arrayInput.length - 1) {
                System.out.print(arrayInput[i] + ", ");
            } else {
                System.out.print(arrayInput[i]);
            }
        }
        System.out.print("]");
    }

    public static int[] exchange(int[] array, int index) {

        int[] firstSplit = new int[index + 1];
        int[] secondSplit = new int[array.length - (index + 1)];

        for (int i = 0; i < firstSplit.length; i++) {

            firstSplit[i] = array[i];

        }

        int num = 0;
        for (int i = index + 1; i < array.length; i++) {

            secondSplit[num] = array[i];

            num++;
        }

        int[] newArr = new int[array.length];

        for (int i = 0; i < secondSplit.length; i++) {

            newArr[i] = secondSplit[i];

        }
        int secondNum = 0;
        for (int i = secondSplit.length; i < array.length; i++) {

            newArr[i] = firstSplit[secondNum];

            secondNum++;
        }
        return newArr;
    }

    public static void printMaxOddIndex(int[] array) {

        int maxOddDigit = Integer.MIN_VALUE;
        int maxOddIndex = -1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= maxOddDigit && array[i] % 2 != 0) {
                maxOddDigit = array[i];
                maxOddIndex = i;
            }
        }
        if (maxOddIndex != -1) {
            System.out.println(maxOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printMaxEvenIndex(int[] array) {

        int maxOddDigit = Integer.MIN_VALUE;
        int maxOddIndex = -1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= maxOddDigit && array[i] % 2 == 0) {

                maxOddDigit = array[i];
                maxOddIndex = i;
            }
        }
        if (maxOddIndex != -1) {
            System.out.println(maxOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printMinOddIndex(int[] array) {

        int minOddDigit = Integer.MAX_VALUE;
        int minOddIndex = -1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= minOddDigit && array[i] % 2 != 0) {
                minOddDigit = array[i];
                minOddIndex = i;
            }
        }
        if (minOddIndex != -1) {
            System.out.println(minOddIndex);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printMinEvenIndex(int[] array) {

        int minEvenDigit = Integer.MAX_VALUE;
        int minEvenIndex = -1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= minEvenDigit && array[i] % 2 == 0) {
                minEvenDigit = array[i];
                minEvenIndex = i;
            }
        }
        if (minEvenIndex != -1) {
            System.out.println(minEvenIndex);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printFirstOddDigits(int[] array, int count) {

        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else if (count == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder output = new StringBuilder();
        output.append("[");

        int countedOdds = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                if (countedOdds == 0) {
                    output.append(array[i]);
                } else {
                    output.append(", ").append(array[i]);
                }
                count--;

                if (count == 0) {
                    break;
                }

                countedOdds++;
            }
        }
        output.append("]");
        System.out.println(output.toString());
    }

    public static void printFirstEvenDigits(int[] array, int count) {

        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else if (count == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder output = new StringBuilder();
        output.append("[");

        int countedEven = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                if (countedEven == 0) {
                    output.append(array[i]);
                } else {
                    output.append(", ").append(array[i]);
                }
                count--;

                if (count == 0) {
                    break;
                }
                countedEven++;
            }
        }
        output.append("]");
        System.out.println(output.toString());
    }

    public static void printLastOddDigits(int[] array, int count) {

        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else if (count == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder output = new StringBuilder();
        output.append("[");

        int countedOdds = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            if (array[i] % 2 != 0) {

                if (countedOdds == 0) {
                    output.append(array[i]);
                } else {
                    output.append(", ").append(array[i]);
                }

                count--;

                if (count == 0) {
                    break;
                }

                countedOdds++;
            }
        }
        output.append("]");
        System.out.println(output.toString());
    }

    public static void printLastEvenDigits(int[] array, int count) {

        if (count > array.length) {
            System.out.println("Invalid count");
            return;
        } else if (count == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder output = new StringBuilder();
        output.append("[");

        int countedEven = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            int currentNumber = array[i];

            if (currentNumber % 2 == 0) {
                if (countedEven == 0) {
                    output.append(currentNumber);
                } else {
                    output.append(", ").append(currentNumber);
                }
                count--;
                if (count == 0) {
                    break;
                }
                countedEven++;
            }
        }
        output.append("]");
        System.out.println(output.toString());
    }
}



