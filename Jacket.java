/**
 * The "Jacket" class.
 */ 
public class Jacket
{
    Student owner;

    /**
     * Constructor that assigns ownership
     */
    public Jacket(Student me)
    {
      owner = me; 
    }

    public String toString()
    {
      return ("This jacket belongs to: " + owner);
    }
    
} // Jacket class
