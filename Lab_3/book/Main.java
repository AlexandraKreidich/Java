package lab_3.book;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Book a = new Book(1,"Uni Press", 2017, 3000 , "Harry Potter", "Joanna Rowling");
        Book b = new Book(2,"Zigzag", 2015, 360 , "Alisa in Wonderland", "Liudmila Kreidich");
        Book c = new Book(3,"Zebra", 2000, 150 , "Pop Sugar", "Alex Gordon", "Darina Fast", "Uliana Khiteeva");
        Book d = new Book(4,"Uni Press", 2017, 389 , "Summer", "Woke Abramov", "Anna Ronichova");
        Book e = new Book(5,"Uni Zebra", 2009, 260 , "Vine for breakfast", "Alexandra Kreidich", "Nadzezhda Khmelnikova");
        Array books = new Array(5);
        books.setElement(1, a);
        books.setElement(2, b);
        books.setElement(3, c);
        books.setElement(4, d);
        books.setElement(5, e);
        System.out.println(books);
        System.out.println('a');
        books.getItemsFromAuthor("Liudmila Kreidich");
        System.out.println('a');
        books.getItemsFromOffica("Uni Press");
        System.out.println('a');
        books.getItemsSinceYear(2009);
    }
}
