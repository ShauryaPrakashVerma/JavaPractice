import java.util.*;

public class Book
{   
    static int totalBooks;

    String title = "";
    String author = "";
    String isbn = "";
    boolean isBorrowed = false;

    static
    {
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    Book(String isbn)
    {
        this("unknown","unknown", isbn);
    }

    static void getTotalBooks()
    {
        System.out.println("Total books :"+ totalBooks);
    }

    public void borrowBook()
    {
        if(!isBorrowed)
        {
            isBorrowed =true;
            System.out.println("Book "+this.title+" borrowed");
        }
        else
            System.out.println("Book "+this.title+" is already borrowed");
    }

    public void returnBook()
    {   
        if (isBorrowed)
        {
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed "+this.title);
        }
        else{
            System.out.println("Book "+this.title+" is already in the library.");
        }
        
    }

    public static void main(String...args)
    {
        Book designOfThings= new Book("God_Of_War", "Unknown", "11");
        Book myBook = new Book("2");
        Book.getTotalBooks();
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        myBook.returnBook();
    
    }
}