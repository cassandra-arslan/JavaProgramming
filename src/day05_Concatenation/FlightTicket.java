package day05_Concatenation;

import javax.swing.plaf.metal.MetalScrollPaneUI;

/* 2.create a class named FlightTicket, and declare the following variables:
                1. from
                2. to
                3. ticketPrice
    use concatenation to display the full info of the ticket
        ex:
            From Las Vegas to McLean is $425.5
             */
public class FlightTicket {
    public static void main(String[] args) {
        String from = "Los Angeles", to = "Paris";
        double ticketPrice = 489.00d;

        System.out.println("Hurry, flights from "+from+ " to "+ to + " are only $"+ticketPrice + " right now!");
        from = "Minneapolis";
        to = "Chicago";
        ticketPrice = 113.05d;
        System.out.println("Hurry, flights from "+from+ " to "+ to + " are only $"+ticketPrice + " right now!");
        from = "Atlanta";
        to = "Fiji";
        ticketPrice = 389.79d;
        System.out.println("Hurry, flights from "+from+ " to "+ to + " are only $"+ticketPrice + " right now!");

    }

}
