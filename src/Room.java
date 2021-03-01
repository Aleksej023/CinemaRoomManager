import java.util.Arrays;

public class Room {
    int rows;
    int seats;
    int numberOfSeats;
    int frontHalf;
    int backHalf;
    String[][] cinemaRoom;

    public void createRoom() {
        cinemaRoom = new String[rows + 1][seats + 1];

        for (String[] strings : cinemaRoom) {
            Arrays.fill(strings, "_");
        }
    }

    public void printRoom() {
        System.out.println("\nCinema:");

        for (int i = 0; i < cinemaRoom.length; i++) {
            for (int j = 0; j < cinemaRoom[i].length; j++) {
                cinemaRoom[0][j] = String.valueOf(j);
                cinemaRoom[i][0] = String.valueOf(i);
                cinemaRoom[0][0] = " ";
                System.out.print(cinemaRoom[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void findOutSizeRoom(Check check) {
        System.out.println("Enter the number of rows:");

        rows = check.checkUserInput();

        System.out.println("Enter the number of seats in each row:");

        seats = check.checkUserInput();

        numberOfSeats = rows * seats;
        frontHalf = rows / 2;
        backHalf = rows - frontHalf;
    }
}
