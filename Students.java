public class Students
{
 static int count = 0;
 public Students () // constructor
 {
 count = count + 1;
 }
 public static int numberOfStudents ()
 {
 return count;
 }
 public static void main (String[] args)
 {
 System.out.println (this.count);
 }
} // class students