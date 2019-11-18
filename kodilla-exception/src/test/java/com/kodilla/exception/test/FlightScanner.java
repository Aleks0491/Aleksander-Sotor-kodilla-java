package com.kodilla.exception.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FlightScanner {

    public void findFlight(Flight flight) throws RouteNotFound {

        Flight flight1 = new Flight("Capetown", "Warsaw");
        Flight flight2 = new Flight("Sydney", "London");
        Flight flight3 = new Flight("Wroclaw", "Paris");


        Map<String, Boolean> destinationAirportsBase = new HashMap<>();
        destinationAirportsBase.put("Warsaw", true);
        destinationAirportsBase.put("London", false);
        destinationAirportsBase.put("Amsterdam", true);
        destinationAirportsBase.put("Berlin", false);

        Boolean result = destinationAirportsBase.get(flight.getDepartureAirport());
        if(result == null) {
            throw new RouteNotFound();
        }
        if(null == destinationAirportsBase.get(flight.getDepartureAirport())
                || !destinationAirportsBase.get(flight.getDepartureAirport())) {
            throw new RouteNotFound();
        }

    }
    public static void main(String[] args) throws RouteNotFound {
        FlightScanner flightScanner = new FlightScanner();

        try {
            flightScanner.findFlight(new Flight("Berlin", "London"));
        } catch(RouteNotFound e) {
            System.out.println("It is not  the flight");
        } finally {
            System.out.println("After catch");
        }
    }
}
