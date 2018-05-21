package com.kodilla.kodillapatterns3.adapter.bookclasifier.libraryA;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;
    private final String signaturel;

    public Book(String author, String title, int publicationYear, String signaturel) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.signaturel = signaturel;
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

    public String getSignaturel() {
        return signaturel;
    }
}
