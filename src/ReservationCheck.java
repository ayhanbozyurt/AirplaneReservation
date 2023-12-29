import java.util.List;

public class ReservationCheck {
    

    public static void printSelectedFlights(List<Flight> selectedFlights, User user) {
    
        if (selectedFlights.isEmpty()) {
            System.out.println("No reservations yet."+ user.getUsername());
        }
        else {
            System.out.println("Your Reservations:");
            for (Flight selectedFlight : selectedFlights) {
                System.out.println("----------------------------");
                System.out.println("Your username: "+ user.getUsername());
                System.out.println("Your Mail adress: "+ user.getEmail());
                System.out.println("Route: " + selectedFlight.getRoute());
                System.out.println("Date: " + selectedFlight.getDate());
                System.out.println("Available Seats: " + selectedFlight.getAvailableSeats());
                System.out.println("----------------------------");
            }
        }
    }
}


