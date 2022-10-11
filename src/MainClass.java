import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {

        Room r = new Room();
        Reservation p2 = r.reserve("Verdi", 120, 150);
        Reservation p4 = r.reserve("Mada", 20, 55);
        Reservation p1 = r.reserve("Pippo", 105, 120);


    }
}
