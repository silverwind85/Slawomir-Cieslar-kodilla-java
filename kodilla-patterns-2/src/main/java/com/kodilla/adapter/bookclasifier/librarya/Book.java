package com.kodilla.adapter.bookclasifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;
    private final String signature;

    public Book(String author, String title, int publicationYear, String singnature) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.signature = singnature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }
}
