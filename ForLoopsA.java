/**
Sophia Nguyen
Ms. Krasteva
Sept. 20, 2018
This assignment displays a table of numbers created from a for loop.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class ForLoopsA //creates a new class called ForLoopsA
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public ForLoopsA ()  //ForLoopsA class constructor
    {
	c = new Console ("For Loops Table"); //creates a new Console object window and names it
    }


    public void displayTitle ()  //displayTitle method
    {
	c.print (' ', 33);
	c.println ("For Loops Table"); //title
	c.println ();
    }


    public void displayTable ()  //displayTable method
    {
	int num; //integer variable declaration
	for (num = 1 ; num <= 5 ; num++) // for loop
	{
	    c.print (num, 8);
	    c.print (num * 12, 11);
	    c.print (num - 16, 15);
	    c.print (num / num * 53 - num, 11);
	    c.print (num + 2, 11);
	    c.print (' ', 12);
	    c.println (num + 6);
	}
    }


    public static void main (String[] args)  //main method
    {
	ForLoopsA f = new ForLoopsA (); //creates instance variable of ForLoopsA and constructs a new ForLoopsA object
	f.displayTitle (); //executes displayTitle method
	f.displayTable (); //executes displayTable method
    }
}
