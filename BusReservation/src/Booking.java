import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String passengerName;
    int busNo;
    Date date;

    public Booking() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the passenger name ");
        passengerName = scanner.next();
        System.out.println("enter the bus number ");
        busNo = scanner.nextInt();
        System.out.println("Enter the date dd-mm-yyyy");
        String dateinput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        date = dateFormat.parse(dateinput);

    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
        int capacity = 0;
        for(Bus bus: buses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for(Booking booking: bookings){
                if(booking.busNo == busNo && booking.date.equals(date)){
                    booked++;
                }
        }

        return booked<capacity?true:false;
    }
}
