// The "StringReverser" class.
import java.awt.*;
import hsa.Console;

public class StringReverser
{
    Console c;           // The output console

    public StringReverser ()
    {
 c = new Console ();
    }


    public void input ()
    {
 String str = "";
 String word = "";
 while (true)
 {
     word = c.readString ();
     str += word + " ";
     if (word.equals ("."))
  break;
 }
 System.out.println (recurse (str));
    }


    public String recurse (String str)
    {
 if (str.substring(0,str.indexOf(' ')).equals ("."))
     return str;
 return recurse (str.substring(str.indexOf (' ')+1)) + "\n" + (str.substring(0,str.indexOf (' ')));
    }


    public static void main (String[] args)
    {
 StringReverser a = new StringReverser ();
 a.input ();
 // Place your program here.  'c' is the output console
    } // main method
} // StringReverser class
