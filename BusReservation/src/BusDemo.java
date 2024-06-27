import java.text.ParseException;
import java.util.*;

public class BusDemo {
    public static void main(String[] args) throws ParseException {

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, false, 3));
        buses.add(new Bus(2, true, 3));
        buses.add(new Bus(3, true, 3));

        int userInput = 1;
        Scanner scanner = new Scanner(System.in);

        for(Bus bus: buses){
            bus.displaybusinfo();
        }
        while (userInput==1) {
            System.out.println("enter 1 to book and 2 to exit");
            userInput = scanner.nextInt();
            if(userInput==1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is added..");
                }else{
                    System.out.println("sorry bus is full");
                }
                
            }
        }
    }
}
