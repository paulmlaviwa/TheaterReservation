package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        System.out.print("What date will you be attending (MM/dd/yyyy): ");
        String enteredDate = scanner.nextLine();

        System.out.print("How many tickets would you like?: ");
        int numberOfTickets = scanner.nextInt();

        String ticketPlural = (numberOfTickets > 1) ? "s" : "";

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate reservationDate = LocalDate.parse(enteredDate, dateFormat);

        String[] nameParts = fullName.split(" ");

        System.out.println(numberOfTickets + " ticket" + ticketPlural + " reserved for " + reservationDate + " under " + nameParts[1] + ", " + nameParts[0]);
    }
}
