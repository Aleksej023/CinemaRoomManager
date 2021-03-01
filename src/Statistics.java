public class Statistics {
    int currentIncome;
    int totalIncome;

    public void printStatistics(Ticket ticket, Room room) {
        System.out.println("\nNumber of purchased tickets: " + ticket.numberPurchasedTickets);
        System.out.println("Percentage of room filling: " + String.format("%.2f", ticket.percentageOccupancy) + "%");

        currentIncome = ticket.numberExpensiveTickets * 10 + ticket.numberCheapTickets * 8;

        System.out.println("Current income: $" + currentIncome);

        totalIncome = room.seats * room.frontHalf * 10 + room.seats * room.backHalf * 8;

        System.out.println("Total income: $" + totalIncome);
    }
}
