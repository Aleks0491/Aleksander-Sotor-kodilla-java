package com.kodilla.good.patterns.challenges.airlines;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightService flightService = new FlightService();
        List<Airport> flightTo = flightService.searchFlightToList(new Airport("Oslo"));

        List<Airport> flightFrom = flightService.searchFlightFrom(new Airport("Kraków"));

        List<Flight> krkMd = flightService.searchFlightFromThroughTo(new Airport("Kraków"), new Airport("Madryt"));

        System.out.println(flightTo);
        System.out.println(flightFrom);
        System.out.println(krkMd);



    }
}
