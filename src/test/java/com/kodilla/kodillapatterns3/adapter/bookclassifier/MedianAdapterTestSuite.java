package com.kodilla.kodillapatterns3.adapter.bookclassifier;

import com.kodilla.kodillapatterns3.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns3.adapter.bookclasifier.libraryA.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Bolesław Prus", "Lalka", 1890, "123456789");
        Book book2 = new Book("Charles Bukowski", "Kobiety", 1978, "234567899");
        Book book3 = new Book("Jakub Żulvzyk", "Wzgórze Psów", 2017, "112345678");
        Book book4 = new Book("Leopold Tyrmand", "Zły", 1956, "122345678");
        Book book5 = new Book("Szczepan Twardoch", "Król", 2015, "998877665");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        Assert.assertEquals(1978, median);
    }
}
