/**
Sophia Nguyen
Ms. Krasteva
Sept. 20, 2018
This assignment displays an asterisk design made using a for loop.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class ForLoopsB //creates a new class called ForLoopsB
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public ForLoopsB ()  //ForLoopsB class constructor
    {
	c = new Console ("For Loops Design"); //creates a new Console object window and names it
    }


    public void displayDesign ()  //displayDesign method
    {
	int num; //integer variable declaration
	for (num = 63 ; num >= 44 ; num--) //for loop
	{
	    c.print (' ', num);
	    c.println ("*  *  *  *  *");
	}
	c.println ();
	c.print ("Sophia Nguyen");
    }


    public static void main (String[] args)  //main method
    {
	ForLoopsB f = new ForLoopsB (); //creates instance variable of ForLoopsB and constructs a new ForLoopsB object
	f.displayDesign (); //executes displayDesign method
    }
}
