import java.awt.*;
import hsa.*;

public class Template
{
    Console c;
    final int AGE = 7; 
    public Template ()
    {
 c = new Console ();
    }
    
    public void method ()
    {
 int i = 0;
 for (++i; i<5; i++)
 {
 c.print (5);
 AGE = 10; 
 c.print (AGE);
 }
    }
    public static void main (String[]args)
    {
 Template t = new Template ();
 t.method ();
    }
}
