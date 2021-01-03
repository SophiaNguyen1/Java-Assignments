/**
 * The "VistualSchool" class for the CrazyObjects problem.
 * @author 
 * @date 
 * @version 1
 */
public class VirtualSchool
{
    /**
     *  Demo test driver for the Crazy Objects problem
     */
  public static void main (String[] args)
    {   // Create a student and display
    Student me = new Student("Arthur");
    System.out.println("Student: "+me+"\n"); 
 
    // Attempt to enter the classroom of Mr. Strict
    ClassRoom ics4u0 = new ClassRoom("ICS4U0", "Mr. Reid");
    if (ics4u0.enterClass(me) == true)
    {
      System.out.println(me+" was allowed into class.");
    }
    else
    {
      System.out.println(me+" was not allowed into class.");        
    }
    
    System.out.println();
    
    // Attempt to enter the classroom of Mr. Strict
    ClassRoom sch3u3 = new ClassRoom("SCH3U3", "Mr. Strict");
    if (sch3u3.enterClass(me) == true)
    {
      System.out.println(me+" was allowed into class.");
    }
    else
    {
      System.out.println(me+" was not allowed into class.");        
    }
  } // main method
} // VirtualSchool class

