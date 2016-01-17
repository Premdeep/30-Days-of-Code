package librarycatalogue;

/**
 *
 * @author Prem
 */
public class Book {

    // Properties of the Class Book
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;
    
    // Constructor
    
    public Book(String bookTitle, int bookPageCount, int bookISBN){
        this.title = bookTitle;
        this.ISBN = bookISBN;
        this.pageCount = bookPageCount;
        isCheckedOut = false;
    }

    // Getters
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }

    // Setters
    public void setTitle(String myTitle) {
        this.title = myTitle;
    }

    public void setPageCount(int myPageCount) {
        this.pageCount = myPageCount;
    }

    public void setISBN(int myISBN) {
        this.ISBN = myISBN;
    }

    public void setIsCheckedOut(boolean newIsCheckedOut, int newDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(newDayCheckedOut);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }

    
}
