/**
 * A class that maintains information on a book.
 * 
 *
 * @author (Cristian Solis)
 * @version (2/15/26)
 */
class Book
{
    /**
     * Private instance variables
     */
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // Exercise 2.85, Added pages and the methods for it
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
    }
    
    // Exercise 2.83
    /**
     * Getter method Returns what is inside String author variable
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Getter method Returns what is inside String title variable
     */
    public String getTitle()
    {
        return title;
    }
    
    // Exercise 2.84
    /**
     * The method printAuthor allows us to print out what's store in author
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * The method printTitle allows us to print out what's store in title
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
     // Exercise 2.85
     /**
      * Getter method getPages returns what's store in pages
      */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * The method printPages prints what's stored in pages
     */
    public void printPages()
    {
        System.out.println(pages);
    }
    
    // Exercise 2.87
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
    


}
