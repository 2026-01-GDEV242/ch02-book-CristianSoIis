/**
 * A class that maintains information on a book.
 * Which can store the author, title, pages, refNumber of the book, how many times borrowed, and is it a course textbook.
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
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    // Exercise 2.85, Added pages and the methods for it
    // Exercise 2.88, Added ref Number in the constructer but not as a paramter and methods for it
    // Exercise 2.91, Added borrow and the methods for it
    // Exercise 2.92, Added courseText and allowed the user to set it to true or false
    public Book(String bookAuthor, String bookTitle, int numPages, boolean text)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        borrow = 0;
        courseText = text;
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
    // Exercise 2.89 Added the refNumber to printDetails method and if statment
    // Exercise 2.91 Added borrow to it
    /**
     * printDetails uses a if/else method to see if the refNumber is empty and if so prints
     * ZZZ else it prints what's stored in refNumber.
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
    // Exercise 2.90 Added a if/else statement 
    /**
     * setRefNumber method uses a if/else statment to determine if what was put in as a param is 
     * longer then 3 charaters and if so puts it in refNumber else it prints a error
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
     * Getter method that returns what's in refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }

    // Exercise 2.91
    /**
     * Getter method that returns what's in borrow
     */
    public int getBorrow()
    {
        return borrow;
    }
    
    /**
     * borrowed is a method that will increase borrow by 1 each time it's called
     */
    public void borrowed()
    {
        borrow++;
    }

    
    // Exercise 2.92
    /**
     * isCourseText is a method that will return true or false deppending what's inside courseText
     */
    public boolean isCourseText()
    {
        return courseText;
    }
}
