import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
    int userChoice;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void selectMenuItem(Room room, Ticket ticket, Statistics statistics, Check check) {
        System.out.println("\nChoose one of the options:\n" +
                "1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit");

        try {
            userChoice = Integer.parseInt(reader.readLine());

            while (userChoice != 0) {
                if (userChoice == 1) {
                    room.printRoom();
                    selectMenuItem(room, ticket, statistics, check);
                } else if (userChoice == 2) {
                    ticket.calculateTicketPrice(check, room.cinemaRoom, room.numberOfSeats, room.frontHalf);
                    selectMenuItem(room, ticket, statistics, check);
                } else if (userChoice == 3) {
                    statistics.printStatistics(ticket, room);
                    selectMenuItem(room, ticket, statistics, check);
                } else {
                    System.out.println("\nError! There is no such option, try again.");
                    selectMenuItem(room, ticket, statistics, check);
                }
            }
        } catch (Exception e) {
            System.out.println("\nError! There is no such option, try again.");
            selectMenuItem(room, ticket, statistics, check);
        }
    }
}
