package com.gla.Level2;
public class MovieTicketRunner {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        ticket1.bookTicket("Avengers: Endgame", 15, 250.0);
        ticket1.displayTicketDetails();
    }
}
