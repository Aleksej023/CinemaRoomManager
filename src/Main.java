public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        Ticket ticket = new Ticket();
        Statistics statistics = new Statistics();
        Check check = new Check();
        Menu menu = new Menu();

        room.findOutSizeRoom(check);
        room.createRoom();
        menu.selectMenuItem(room, ticket, statistics, check);
    }
}
