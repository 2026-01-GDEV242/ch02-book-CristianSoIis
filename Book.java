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
  

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    
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
    
    
}
