import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {


// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    private int price;
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here

    void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d\n", this.title, this.author, this.price);
    }
    
// End class
}
