package com.kodilla.good.patterns.challenges;

import java.util.Set;
import java.util.stream.Collectors;

public class GoodPatternsMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        String list = movieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(list);
    }
}
