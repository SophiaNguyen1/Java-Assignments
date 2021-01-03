// The "ComparableFinder" class.
import java.awt.*;
import java.util.*;

public class ComparableFinder
{

    public ComparableFinder ()
    {
    }


    public void input ()
    {
        ArrayList<Object> arrOfElements = new ArrayList<>();
        arrOfElements.add("hello");
        arrOfElements.add("string");
        arrOfElements.add("book");
        arrOfElements.add("rain");
        
        Object findItem = "book";
        System.out.println (searchItem (arrOfElements, findItem));
    }


     public boolean searchItem (ArrayList<Object> list, Object item)
     {
         if (list.size() == 0)
             return false;   
         if (list.get(list.size() - 1).equals(item))
             return true;
         list.remove(list.size() - 1);
         return searchItem(list, item); 
     }


    public static void main (String[] args)
    {
        ComparableFinder a = new ComparableFinder ();
        a.input ();
        // Place your program here.  'c' is the output console
    } // main method
} // ComparableFinder class
