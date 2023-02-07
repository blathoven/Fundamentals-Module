package Exams.MoreExercises;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDaysTournament = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;
        int totalWin = 0;
        int totalLose = 0;
        boolean ifWin = false;

        for (int i = 1; i <= totalDaysTournament; i++) {

            String sportType = scanner.nextLine();

            double moneyForTheDay = 0;
            int winForADay = 0;
            int loseForADay = 0;

            while (!sportType.equals("Finish")) {

                String winOrLose = scanner.nextLine();

                if (winOrLose.equals("win")) {
                    moneyForTheDay += 20;
                    winForADay++;
                    totalWin++;

                } else {
                    loseForADay++;
                    totalLose++;
                }

                sportType = scanner.nextLine();
            }
            if (winForADay > loseForADay) {
                moneyForTheDay = moneyForTheDay + (moneyForTheDay * 10 / 100);
            }

            totalMoney += moneyForTheDay;

        }
        if (totalWin > totalLose) {
            totalMoney = totalMoney + (totalMoney * 20 / 100);
            ifWin = true;
        }
        if (ifWin) {
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
