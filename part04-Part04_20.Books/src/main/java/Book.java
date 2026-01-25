/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josaca
 */
public class Book {
    
    private String title;
    private int pages;
    private int year;
    
    public Book(String bookTitle, int bookPages, int bookYear){
        this.title = bookTitle;
        this.pages = bookPages;
        this.year = bookYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int geyYear(){
        return this.year;
    }
    
    
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
    
    
}
