package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> wholeWorld = new ArrayList<>();

    public World(List<Continent> wholeWorld) {
        this.wholeWorld = wholeWorld;
    }

    public List<Continent> getWholeWorld() {
        return wholeWorld;
    }

    public BigDecimal getPeopleQuantity() {
        return wholeWorld.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, curent) -> sum = sum.add(curent));
    }
}
