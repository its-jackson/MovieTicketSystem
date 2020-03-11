public class MovieTicket {
    private String movieName;
    private int ticketNumber;
    private int theatreNumber;
    public static final double TICKET_PRICE = 59.99;

    public MovieTicket(String movieName, int ticketNumber, int theatreNumber) {
        this.movieName = movieName;
        this.ticketNumber = ticketNumber;
        this.theatreNumber = theatreNumber;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTheatreNumber() {
        return theatreNumber;
    }

    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }

    public static double generateTicketTax() {
        double tax = 0.13;
        double ticketTax = tax * TICKET_PRICE;
        double ticketTaxRound = (double) Math.round(ticketTax * 100) / 100;
        return ticketTaxRound;
    }

    public String computeMovieInfo(int ticketNumber) {
        String movieInfo = null;
        String ticketNumberString = Integer.toString(ticketNumber);
        String ticketNumberDigit1 = ticketNumberString.substring(0, 1);
        final int TICKET_NUMBER = Integer.parseInt(ticketNumberDigit1);
        
        if (TICKET_NUMBER == 1) {
            movieName = "JAWS";
            movieInfo = "March 10th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if (TICKET_NUMBER ==  2) {
            movieName = "JAWS 2";
            movieInfo = "March 11th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if(TICKET_NUMBER == 3) {
            movieName = "JAWS 3";
            movieInfo = "March 12th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if (TICKET_NUMBER == 4) {
            movieName = "JAWS 4";
            movieInfo = "March 13th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if (TICKET_NUMBER == 5) {
            movieName = "JAWS 5";
            movieInfo = "March 14th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if (TICKET_NUMBER == 6) {
            movieName = "JAWS 6";
            movieInfo = "March 15th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if (TICKET_NUMBER == 7) {
            movieName = "JAWS 7";
            movieInfo = "March 16th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if (TICKET_NUMBER == 8) {
            movieName = "JAWS 8";
            movieInfo = "March 17th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else if (TICKET_NUMBER == 9) {
            movieName = "JAWS 9";
            movieInfo = "March 18th 2023 - 6:00pm / 8:00pm / 10:00pm";
        } else {
            movieInfo = null;
        }
        return movieName + " " + movieInfo;
    }

    public String computeMovieInfo(String movieName) {
        String movieInfo = null;

        switch (movieName.toUpperCase()) {
            case "JAWS":
                movieInfo = "March 10th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 2":
                movieInfo = "March 11th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 3":
                movieInfo = "March 12th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 4":
                movieInfo = "March 13th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 5":
                movieInfo = "March 14th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 6":
                movieInfo = "March 15th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 7":
                movieInfo = "March 16th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 8":
                movieInfo = "March 17th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            case "JAWS 9":
                movieInfo = "March 18th 2023 - 6:00pm / 8:00pm / 10:00pm";
                break;
            default:
                movieInfo = null;
        }
        return movieName + " " + movieInfo;
    }
}
