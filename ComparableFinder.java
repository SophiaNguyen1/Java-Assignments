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
        ArrayList<Comparable> arrOfElements = new ArrayList<>();
        arrOfElements.add("hello");
        arrOfElements.add("string");
        arrOfElements.add("book");
        arrOfElements.add("rain");
        
        Comparable findItem = "string";
        System.out.println (searchItem (arrOfElements, findItem));
    }


     public boolean searchItem (ArrayList<Comparable> list, Comparable item)
     {
         if (list.size() == 0)
             return false;   
         if (list.get(0).equals(item))
             return true;
         return searchItem(list.subList(1,list.size()), item); 
     }


    public static void main (String[] args)
    {
        ComparableFinder a = new ComparableFinder ();
        a.input ();
        // Place your program here.  'c' is the output console
    } // main method
} // ComparableFinder class
