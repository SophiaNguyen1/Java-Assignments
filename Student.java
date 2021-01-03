// The "Student" class.
public class Student
{
    String number; 
    String name; 
    Locker myLocker; 
    Jacket myJacket; 
    Book[] books; 
    
    /**
     * Constructor
     * @param String myName - name of the student
     */
    public Student(String myName)
    { 
      name = myName; 
      number = "" + (int)(Math.random()*2000+1);
      myLocker = new Locker (this);
      myJacket = myLocker.getJacket();
      books = new Book[4];
      books[0] = myLocker.getABook("ENG2D3");
      books[1] = myLocker.getABook("ICS4U0");
      books[2] = myLocker.getABook("SCH3U3");
      books[3] = myLocker.getABook("CHC2D1");
    }
    

    /**
     * This method gets called when the student is sent to the office
     */
    public void sentToOffice(String reason)
    {
      System.out.println ("The student was sent to the office because he/she " + reason + ".");
    }

    /** 
     * Display student information
     */
     public String toString()
     {
       return name;
     }
    
} // Student class
