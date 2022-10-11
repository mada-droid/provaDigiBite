public class MainClass {
    public static void main(String[] args) {

        Room r = new Room();
        Reservation p1 = r.reserve("Pippo", 105, 120);
        System.out.println();
    }
}
