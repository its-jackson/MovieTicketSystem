import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket movieTicketOne = new MovieTicket("Jaws", 201, 12);

        System.out.println("Enter Movie Name:");
        movieTicketOne.setMovieName(sc.nextLine().toUpperCase());
        System.out.println("Enter Ticket Number:");
        movieTicketOne.setTicketNumber(sc.nextInt());
        System.out.println("Enter Theatre Number:");
        movieTicketOne.setTheatreNumber(sc.nextInt());
        System.out.println("--------------------");
        System.out.println("Movie Name: " + movieTicketOne.getMovieName());
        System.out.println("Ticket Number: " + movieTicketOne.getTicketNumber());
        System.out.println("Theatre Number: " + movieTicketOne.getTheatreNumber());
        System.out.println("Ticket Price: " + "$" + MovieTicket.TICKET_PRICE);
        System.out.println("Ticket Tax: " + "$" + MovieTicket.generateTicketTax());
        System.out.println("Movie Show Times: " + movieTicketOne.computeMovieInfo(movieTicketOne.getMovieName()));
        System.out.println("Thank you, enjoy the movie.");

        System.out.println("Instantiating 100 MovieTicket Objects.");
        System.out.println("Instantiating 100 MovieTicket Objects..");
        System.out.println("Instantiating 100 MovieTicket Objects...");
        System.out.println("Instantiating 100 MovieTicket Objects....");
        System.out.println("Instantiating 100 MovieTicket Objects.....");

        MovieTicket[] movieTicketArray = new MovieTicket[100];

        for (int i = 0; i < movieTicketArray.length; i++) {
            if (i < (movieTicketArray.length - 10)) {
                movieTicketArray[i] = new MovieTicket("Jaws", 102, 8);
            } else {
                movieTicketArray[90] = new MovieTicket("Jaws 2", 341, 10);
                movieTicketArray[91] = new MovieTicket("Jaws 3", 1231, 5);
                movieTicketArray[92] = new MovieTicket("Jaws 4", 102, 4);
                movieTicketArray[93] = new MovieTicket("Jaws 5", 642, 13);
                movieTicketArray[94] = new MovieTicket("Jaws 6",1000, 3);
                movieTicketArray[95] = new MovieTicket("Jaws 7", 32222, 27);
                movieTicketArray[96] = new MovieTicket("Jaws 8", 822, 19);
                movieTicketArray[97] = new MovieTicket("Jaws 9", 787, 24);
                movieTicketArray[98] = new MovieTicket("Jaws 4", 3439, 5);
                movieTicketArray[99] = new MovieTicket("Jaws 7", 431, 1);
            }

            /*System.out.println("Movie Name: " + movieTicketArray[i].getMovieName()
                    + " --- " + "Ticket Number: " + movieTicketArray[i].getTicketNumber()
                    + " --- " + "Theatre Number: " + movieTicketArray[i].getTheatreNumber()
                    + " --- " + "Movie Info: " + movieTicketArray[i].computeMovieInfo(movieTicketArray[i]
                    .getMovieName()));*/

            if (movieTicketArray[i] == movieTicketArray[99]) {
                System.out.println("INSTANTIATION SUCCESSFULLY COMPLETED");
            }
        }

        for (MovieTicket i : movieTicketArray) {
            System.out.println("Movie Name: " + i.getMovieName() +
                    " --- " + "Ticket Number: " + i.getTicketNumber() +
                    " --- " + "Theatre Number: " + i.getTheatreNumber() +
                    " --- " + "Movie Info: " + i.computeMovieInfo(i.getMovieName()));
        }
    }
}
