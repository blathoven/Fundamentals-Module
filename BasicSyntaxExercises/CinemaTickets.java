package Exams.eleventh;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();


        int allStudent = 0;
        int allStandard = 0;
        int allKid = 0;
        int allTickets = 0;

        while (!movieName.equals("Finish")) {

            int freeSits = Integer.parseInt(scanner.nextLine());

            int busySits = 0;
            int student = 0;
            int standard = 0;
            int kid = 0;

            String typeTicket = scanner.nextLine();
            while (busySits < freeSits && !typeTicket.equals("End")) {

                switch (typeTicket) {
                    case "student":
                    busySits++;
                    student++;
                    allStudent++;
                    allTickets++;
                        break;
                    case "standard":
                    busySits++;
                    standard++;
                    allStandard++;
                    allTickets++;
                        break;
                    case "kid":
                     busySits++;
                     kid++;
                     allKid++;
                     allTickets++;
                        break;

                } if (busySits == freeSits) {
                    break;
                }
                typeTicket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, ((busySits * 1.00) / freeSits) * 100);

            if (typeTicket.equals("Finish")) {
                break;
            }
            movieName = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", (allStudent * 1.00 / allTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (allStandard * 1.00 / allTickets) * 100);
        System.out.printf("%.2f%% kids tickets.", (allKid * 1.00 / allTickets) * 100);
    }
}
