// The "ClassRoom" class.
public class ClassRoom
{
    String course;
    String teacher;
    
    /**
     * Default constructor
     */
    public ClassRoom(String theCourse, String theTeacher)
    {
     course = theCourse;
     teacher = theTeacher;
    }

    public boolean enterClass (Student student)
    {
      System.out.println ("Student name: " + student + "\nCourse: " + course + "\nTeacher: " + teacher);
      
      if (student.myLocker == null)
      {
        student.sentToOffice ("did not have a locker."); 
        return false;
      }
      if (student.myJacket != null)
      {
        System.out.println ("The student " + student + " was sent to their locker to put away their jacket.");
        return false;
      }
      if (!(student.books[0].course.equals(course)))
      {
        if (!(student.books[1].course.equals(course)))
        {
          if (!(student.books[2].course.equals(course)))
          {
           if (!(student.books[3].course.equals(course)))
           {  
            student.sentToOffice ("did not have the necessary book for the course " + course + "."); 
            return false;
           }
          }
        }
      }
      return true;
    }

    
} // ClassRoom class
