public class Room {

    private String name;
    private int checkInDate;
    private int checkOutDate;

    public Room() {
    }

    public Room(String name, int checkInDate, int checkOutDate) {
        this.name = name;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(int checkInDate) {
        this.checkInDate = checkInDate;
    }

    public int getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(int checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }

    public Reservation reserve(String name, int checkInDate, int checkOutDate) {
        Reservation reservation = new Reservation(new Room(name,checkInDate,checkOutDate));
        return reservation;
    }
}
