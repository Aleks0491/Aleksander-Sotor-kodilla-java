package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int publicztionYear;

    public Book(String title, String author, int publicztionYear) {
        this.title = title;
        this.author = author;
        this.publicztionYear = publicztionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicztionYear() {
        return publicztionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublicztionYear() == book.getPublicztionYear() &&
                getTitle().equals(book.getTitle()) &&
                getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getPublicztionYear());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicztionYear=" + publicztionYear +
                '}';
    }
}
