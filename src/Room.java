import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Room{

    private ArrayList<Reservation> reservationsList;

    public Room() {
        reservationsList = new ArrayList<>();
    }

    public boolean isOccupied(ArrayList<Reservation> reservations, int newCheckInDate, int newCheckOutDate){
        boolean status = false;
        for (Reservation reservation : reservations) {
            if((newCheckOutDate <= reservation.getCheckInDate()) ||
                newCheckInDate >= reservation.getCheckOutDate()){
                status = false;
            }else{
                status = true;
            }
        }
        return status;
    }

    public Reservation reserve(String name, int checkInDate, int checkOutDate) {

        //check if the two dates are in ascending order
        if(checkInDate > checkOutDate){
            throw new RuntimeException("You can't go back in time");
        }

        //check if the room is occupied, if true return an exception, else add it to the arraylist
        if(isOccupied(reservationsList,checkInDate,checkOutDate)){
            throw new RuntimeException("Someone already reserved the room in this period, choose another date !");
        }

        Reservation reservation = new Reservation(name,checkInDate,checkOutDate);
        reservationsList.add(reservation);
        return reservation;
    }

   public ArrayList<Reservation> reservations(){
       List<Reservation> sortedList = reservationsList.stream()
               .sorted(Comparator.comparingInt(Reservation::getCheckInDate))
               .collect(Collectors.toList());

       return (ArrayList<Reservation>) sortedList;
   }

    @Override
    public String toString() {
        return "Room{" +
                "reservations=" + reservationsList +
                '}';
    }




}
