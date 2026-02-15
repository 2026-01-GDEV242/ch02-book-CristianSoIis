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
    private String refNumber;
    private int borrow;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // Exercise 2.85, Added pages and the methods for it
    // Exercise 2.88, Added ref Number in the constructer but not as a paramter and methods for it
    // Exercise 2.91, 
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        borrow = 0;
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
    // Exercise 2.89 Added the refNumber to printDetails method
    // Exercise 2.91
    /**
     * 
     */
    public void printDetails()
    {
        if(getRefNumber().length() == 0)
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", refNumber: ZZZ, Borrow: " + borrow);
        }
        else
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", refNumber: " + refNumber + ", Borrow: " + borrow);
        }
        
    }
    
  
    // Exercise 2.88
    // Exercise 2.90
    /**
     * 
     */
    public void setRefNumber(String refNum)
    {
        if(refNum.length() < 3)
        {
            System.out.println("Error, please make the refNumber at least 3 charaters long");
        }
        else
        {
            refNumber = refNum;
        }
    }
    
    /**
     * 
     */
    public String getRefNumber()
    {
        return refNumber;
    }

    /**
     * 
     */
    // Exercise 2.91
    public int getBorrow()
    {
        return borrow;
    }
    
    public void borrowed()
    {
        borrow++;
    }

}
