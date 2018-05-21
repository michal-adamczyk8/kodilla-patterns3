package com.kodilla.kodillapatterns3.adapter.bookclasifier;

import com.kodilla.kodillapatterns3.adapter.bookclasifier.libraryA.Book;
import com.kodilla.kodillapatterns3.adapter.bookclasifier.libraryA.Classifier;
import com.kodilla.kodillapatterns3.adapter.bookclasifier.libraryB.BookSignature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet){

        Map<BookSignature, com.kodilla.kodillapatterns3.adapter.bookclasifier.libraryB.Book> books = new HashMap<>();
        for (Iterator<Book> book = bookSet.iterator(); book.hasNext(); ) {
            Book currentBook = book.next();
            books.put(new BookSignature(currentBook.getSignaturel()),
                    new com.kodilla.kodillapatterns3.adapter.bookclasifier.libraryB.Book(currentBook.getAuthor(),
                            currentBook.getTitle(), currentBook.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
