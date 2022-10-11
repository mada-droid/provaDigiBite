public class Reservation {


    private Room room;

    public Reservation(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "room=" + room +
                '}';
    }
}
