package com.kodilla.good.patterns.challenges.airlines;

public class Application {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        flightService.searchFlightToList(new Airport("Kraków"));

        flightService.searchFlightFrom(new Airport("Wrocław"));

        flightService.searchFlightFromThroughTo(new Airport("Kraków"), new Airport("Wrocław"));



    }
}
