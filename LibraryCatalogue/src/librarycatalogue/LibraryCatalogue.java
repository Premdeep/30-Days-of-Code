
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;


public class LibraryCatalogue {
    
    // setting up Library Dictionary
    Map<String,Book> bookCollection = new HashMap <>();
    
    // Properties of the Library Catalogue
    
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double lateFeePerDay = 1.00;
    
    // Constructors for our Catalogue
    
    public LibraryCatalogue(Map<String,Book> collection){
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod,
            double initialLateFee, double lateFeePerDay){
        
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.lateFeePerDay = lateFeePerDay;
    }
    
    // Getters Methods
    
    public int getCurrentDay(){
        return this.currentDay;
    }
    
    public Map<String,Book> getBookCollection(){
        return this.bookCollection;
    }
    
    public int getLengthOfCheckoutPeriod(){
        return this.lengthOfCheckoutPeriod;
    }
    
    public double getInitialLateFee(){
        return this.initialLateFee;
    }
    
    public double getLateFeePerDay(){
        return this.lateFeePerDay;
    }
    
    // very important step. Here Book is present in the dictionary as a 
    // value so to retrive it we have to provide the key to the getBook
    // collection dictionary which will give us the value which is the Book Class itself.
    
    public Book getBook(String title){
        return getBookCollection().get(title); // this gives me the Book class related to the title
    }
    
    // Setters Methods
    
    // Methods to set CurrentDay
    public void nextDay(){
        this.currentDay++;
    }
    
    public void setDay(int day){
        this.currentDay = day;
    }
    
    // Instance Methods for other Properties
    
    public void checkoutBook(String title){
        Book book = getBook(title);        
        if ( book.getIsCheckedOut() ){
            
            sorryBookAlreadyCheckedOut(book);
            
        } else {
            book.setIsCheckedOut(true,currentDay);
            System.out.println("YOu have checked out a Book "+title+" It is due"
                    + " on day "+ (getCurrentDay()+ getLengthOfCheckoutPeriod())+ ".");
        }
            
        
    }
    
    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0){
            System.out.println("THe book is late by "+daysLate+ " days. and you owe library $ "+ (getInitialLateFee() + daysLate *getLateFeePerDay())+ ".");
        }else{
            System.out.println("Book Returned THankyou.");
        }
        book.setIsCheckedOut(false,-1);
        
        
    }
    
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, "+ book.getTitle()+ " is already checked out"
        +" it should be back by Day "+ ( book.getDayCheckedOut()+ getLengthOfCheckoutPeriod())+ " ." );
    }
            
   
    
    public static void main(String[] args) {
        
        Map<String,Book> bookCollection = new HashMap<>();
        
        Book harry = new Book("Harry Potter",567,9999999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkoutBook("Harry Potter");
        lib.nextDay();
        lib.setDay(5);
        lib.checkoutBook("Harry Potter");
        lib.setDay(19);
        lib.returnBook("Harry Potter");
        lib.checkoutBook("Harry Potter");
        
        
    }
    
}
