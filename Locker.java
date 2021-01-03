import java.util.Random;

// The "Locker" class.
public class Locker
{
    int number;
    Student owner;
    private Jacket studentJacket;
    private Book[] books;
    
    /**
     * Default constructor
     */
    public Locker(Student me)
    {
      owner = me; 
      number = (int)(Math.random()*2000+1);
      
      books = new Book[4];
      Book english = new Book();
      english.setTitle ("Shakespeare Plays");
      english.setCourse ("ENG2D3");
      
      Book ics = new Book();
      ics.setTitle ("Barron's Textbook");
      ics.setCourse ("ICS4U0");
      
      Book chemistry = new Book();
      chemistry.setTitle ("Chemistry 11");
      chemistry.setCourse ("SCH3U3");
      
      Book history = new Book();
      history.setTitle ("Creating Canada: A History");
      history.setCourse ("CHC2D1");
      
      books[0] = english;
      books[1] = ics;
      books[2] = chemistry;
      books[3] = history; 
    }

    public Book getABook (String course)
    {
      for (Book b: books)
      {
        if (b.course.equals (course))
          return b; 
      }
      return null;   
    }
    
    public void putABook (Book book)
    {
      for (int i = 0; i < books.length; i++)
      {
        if (books[i] == null)
        {
          books[i] = book; 
          break;
        }
      }
    }
    
    public Jacket getJacket()
    {
      return (new Jacket (owner));
    }

    
    public Jacket checkJacket()
    {
      return studentJacket; 
    }

    public void putJacket(Jacket myJacket)
    {
      studentJacket = myJacket;
    }
    
    public void assignOwner(Student me)
    {
      owner = me; 
    }
    
    public String toString()
    {
      return ("Locker " + number + " belongs to " + owner);
    }
    
} // Locker class
