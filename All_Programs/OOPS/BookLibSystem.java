import java.util.*;

public class BookLibSystem
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

    BookLibSystem(String title, String author, String.isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    BookLibSystem(String.isbn)
    {
        this("unknown","unknown", isbn);
    }

    static int getTotalBooks()
    {
        System.out.println("Total books :"+ totalBooks);
    }

    public void borrowBook()
    {
        if(isBorrowed)
        {
            isBorrowed =false;
            System.out.println("Book borrowed");
            totalBooks--;
        }
        else
            System.ot.println("Thi is not borroed")
    }

    public void returnBook()
    {
        System.out.println("Book returned");
        totalBooks--;
    }

    public static void main(String...args)
    {
        Book designOfThings= new Book("title", "Unknown", "11");
        System.out.println("BookLibSystem.getTotalBooks");
        System.out.println
    
    }
}