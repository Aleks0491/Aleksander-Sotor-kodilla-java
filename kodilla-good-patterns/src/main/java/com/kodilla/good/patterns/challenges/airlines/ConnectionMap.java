package com.kodilla.good.patterns.challenges.airlines;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionMap {

    public Map<List<Airport>, List<Airport>> connection () {

        List<Airport> departureAirportsList = new ArrayList<>();
        departureAirportsList.add(new Airport("Kraków"));
        departureAirportsList.add(new Airport("Wrocław"));
        departureAirportsList.add(new Airport("Berlin"));
        departureAirportsList.add(new Airport("Praga"));
        departureAirportsList.add(new Airport("Paryż"));
        departureAirportsList.add(new Airport("Radom"));

        List<Airport> arrivalAirportsList = new ArrayList<>();
        arrivalAirportsList.add(new Airport("Kraków"));
        arrivalAirportsList.add(new Airport("Gdańsk"));
        arrivalAirportsList.add(new Airport("Wrocław"));
        arrivalAirportsList.add(new Airport("Wilno"));
        arrivalAirportsList.add(new Airport("Madryt"));
        arrivalAirportsList.add(new Airport("Monachium"));
        arrivalAirportsList.add(new Airport("Oslo"));
        arrivalAirportsList.add(new Airport("Moskwa"));

        Map<List<Airport>, List<Airport>> connectMap = new HashMap<>();
        connectMap.put(departureAirportsList, arrivalAirportsList);

        return connectMap;
    }

    public ConnectionMap() {
    }

}
