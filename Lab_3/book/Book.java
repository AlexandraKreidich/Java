package lab_3.book;

import java.util.Arrays;
import java.lang.String;

public class Book {
    private final int ID;
    private final String[] AUTHOR;
    private String office;
    private int yearOfPublishing;
    private int numberOfPages;
    private float price = 10000;
    private String binderType = "soft";
    private String name;

    public Book(int id, String office, int year, int pages, String name,String...authors) {
        ID = id;
        AUTHOR = authors;
        this.office = office;
        this.yearOfPublishing = year;
        this.numberOfPages = pages;
        this.name = name;
    }

    public Book(int id, String name, String...authors){
        ID = id;
        AUTHOR = authors;
        this.name = name;
    }

    public int getID(){
        return this.ID;
    }

    public String[] getAUTHOR(){
        return this.AUTHOR;
    }

    public String getOffice(){
        return this.office;
    }

    public int getYearOfPublishing(){
        return this.yearOfPublishing;
    }

    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public float getPrice(){
        return this.price;
    }

    public String getBinderType(){
        return this.binderType;
    }

    public String getName(){
        return this.name;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public void setYearOfPublishing(int year){
        this.yearOfPublishing = year;
    }

    public void setNumberOfPages(int pages){
        this.numberOfPages = pages;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setBinderType(String type){
        this.binderType = type;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID = " + ID + "," + '\n'+
                "AUTHOR = " + Arrays.toString(AUTHOR) + "," + '\n'+
                "office = '" + office + "," + '\'' + '\n'+
                "yearOfPublishing = " + yearOfPublishing + "," + '\n'+
                "numberOfPages = " + numberOfPages + "," + '\n'+
                "price = " + price + "," + '\n'+
                "binderType = '" + binderType + "," + '\'' + '\n'+
                "name = '" + name + "," + '\'' +
                '}';
    }
}
