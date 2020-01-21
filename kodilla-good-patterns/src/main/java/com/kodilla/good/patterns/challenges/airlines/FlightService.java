package com.kodilla.good.patterns.challenges.airlines;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private ConnectionMap connectionMap = new ConnectionMap();

    public List<Airport> searchFlightFrom(Airport airport) {

        List<Airport> flightFromList = connectionMap.connection().entrySet().stream()
                .flatMap(d -> d.getKey().stream())
                .filter(a -> a.getName().equals(airport.getName()))
                .collect(Collectors.toList());

        for(int i=0; i<flightFromList.size(); i++) {
            System.out.println(flightFromList.get(i));
        }

        return  flightFromList;


    }

    public List<Airport> searchFlightToList(Airport airport) {

        List<Airport> flightToList = connectionMap.connection().entrySet().stream()
                      .flatMap(d -> d.getValue().stream())
                      .filter(a -> a.equals(airport.getName()))
                      .collect(Collectors.toList());

        System.out.println(flightToList.stream()
        .map(s -> s.getName()));

        return  flightToList;
    }

    public List<Flight> searchFlightFromThroughTo(Airport departureAirport, Airport arrivalAirport) {

        List<Airport> departAirport = searchFlightFrom(departureAirport);
        List<Airport> arrivAirport = searchFlightToList(arrivalAirport);

        List<Airport> transAirports = departAirport.stream()
                .filter(arrivAirport::contains)
                .collect(Collectors.toList());

        List<Flight> flightFromThroughToList = transAirports.stream()
                .map(f -> new Flight(departureAirport, f, arrivalAirport))
                .collect(Collectors.toList());

        return  flightFromThroughToList;
    }
}
