/**
Sophia Nguyen
Ms. Krasteva
Sept. 12, 2018
This assignment displays student test marks.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class TestMarks //creates a new class called TestMarks
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public TestMarks ()  //TestMarks class constructor
    {
	c = new Console (); //creates a new Console object window
    }


    public void drawTitle ()  //drawTitle method
    {
	c.print (' ', 15);
	c.print ("Student");
	c.print (' ', 10);
	c.print ("Test " + 1);
	c.print (' ', 5);
	c.print ("Test " + 2);
	c.print (' ', 6);
	c.println ("Test Average");
	c.println ();
    }


    public void displayMarks ()  //displayMarks method
    {
	c.print (' ', 15);
	c.print ("Donald");
	c.print (45, 13);
	c.print (80, 11);
	c.println ((45.0 + 80) / 2, 15, 2);
	c.print (' ', 15);
	c.print ("Mickey");
	c.print (33, 13);
	c.print (39, 11);
	c.println ((33 + 39) / 2, 15, 2);
	c.print (' ', 15);
	c.print ("Bugs");
	c.print (79, 15);
	c.print (92, 11);
	c.print ((79.0 + 92) / 2, 15, 2);
    }


    public static void main (String[] args)  //main method
    {
	TestMarks t = new TestMarks (); //creates instance variable of TestMarks and constructs a new TestMarks object
	t.drawTitle (); //executes drawTitle method
	t.displayMarks (); //executes displayMarks method
    }
}

