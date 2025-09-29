import java.util.ArrayList;

class MovieTicket{
    String personName;
    String movieName;
    String seatNumber;

    public MovieTicket(String personName, String movieName, String seatNumber) {
        this.personName = personName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "personName='" + personName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
public class TicketBookingSystem {
    public static void main(String[] args) {
        ArrayList<MovieTicket> movieTickets = new ArrayList<>();

        // Book tickets
        movieTickets.add(new MovieTicket("John", "The Lion Kind", "A101"));
        movieTickets.add(new MovieTicket("Smith", "Spider man", "B05"));
        movieTickets.add(new MovieTicket("Ana", "Avengers", "G123"));

        // Show All booked tickets
//        System.out.println("All Booked tickets: "+ movieTickets);
        System.out.println("All Booked Tickets:");
        for(MovieTicket ticket: movieTickets){
            System.out.println(ticket);
        }
    }
}
