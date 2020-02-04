package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My library");
        library.getBooks().add(new Book("Pele", "Pele", LocalDate.of(1999, 12,12)));
        library.getBooks().add(new Book("Maradona", "Maradona", LocalDate.of(1995, 11, 11)));
        library.getBooks().add(new Book("Lewy", "Lewy", LocalDate.of(2019, 11, 16)));
        library.getBooks().add(new Book("Strejlau", "Strejlau", LocalDate.of(2005,5, 8)));

        //making shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Public library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Private library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Title", "Author", LocalDate.of(2020,01,02)));
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());

    }
}
