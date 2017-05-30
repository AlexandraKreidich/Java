package lab_3.book;

import java.lang.String;
import java.util.Arrays;

public class Array {

    public Book [] books;

    public Array(Book ... arr){
        this.books = new Book[arr.length];
        for(int i=0; i<arr.length; i++) {
            this.books[i] = arr[i];
        }
    }

    public Array(int n){
        this.books = new Book[n];
        for(int i=0; i<n; i++) {
            this.books[i] = null;
        }
    }

    public void setElement(int i, Book a){
        this.books[--i] = a;
    }

    public void getItemsFromAuthor(String author){
        System.out.println("книги автора " + author + " : ");
        for(int i=0; i<this.books.length; i++){
            String[] authors = this.books[i].getAUTHOR();
            for(int j=0; j<authors.length; j++) {
                if (authors[j] == author) {
                    System.out.println(this.books[i].toString());
                }
            }
        }
    }

    public void getItemsFromOffica(String office){
        System.out.println("книги издательства " + office + " : ");
        for(int i=0; i<this.books.length; i++){
                if (this.books[i].getOffice() == office) {
                    System.out.println(this.books[i].toString());
                }
        }
    }

    public void getItemsSinceYear(int year){
        System.out.println("Книги с датой издания после " + year + " : ");
        for(int i=0; i<this.books.length; i++){
            if (this.books[i].getYearOfPublishing() > year) {
                System.out.println(this.books[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Array{ " +
                "books = " + Arrays.toString(books) +
                '}';
    }
}
