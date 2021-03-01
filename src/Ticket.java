public class Ticket {
    int currentRow;
    int currentSeat;
    int ticketPrice;
    int numberExpensiveTickets;
    int numberCheapTickets;
    int numberPurchasedTickets;
    double percentageOccupancy;

    public void calculateTicketPrice(Check check, String[][] cinemaRoom, int numberOfSeats, int frontHalf) {


        while (true) {
            System.out.println("\nEnter a row number:");

            currentRow = check.checkUserInput();

            if (currentRow <= 0 || currentRow > cinemaRoom.length - 1) {
                System.out.println("\nError! There is no such row, try again.");
                continue;
            }

            System.out.println("Enter a seat number in that row:");

            currentSeat = check.checkUserInput();

            if (currentSeat <= 0 || currentSeat > cinemaRoom.length - 1) {
                System.out.println("\nError! There is no such seat, try again.");
                continue;
            }

            if (cinemaRoom[currentRow][currentSeat].equals("X")) {
                System.out.println("\nError! That ticket has already been purchased, try again.");
                continue;
            } else if (cinemaRoom[currentRow][currentSeat].equals("_")) {
                cinemaRoom[currentRow][currentSeat] = "X";
                numberPurchasedTickets++;
                percentageOccupancy = (double)numberPurchasedTickets / (double)numberOfSeats * 100;

                if (numberOfSeats <= 60) {
                    ticketPrice = 10;
                    numberExpensiveTickets++;
                } else if (currentRow <= frontHalf){
                    ticketPrice = 10;
                    numberExpensiveTickets++;
                } else {
                    ticketPrice = 8;
                    numberCheapTickets++;
                }

                System.out.println("\nTicket price: $" + ticketPrice);
            }
            break;
        }
    }
}
