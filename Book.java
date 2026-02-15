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
    
}
