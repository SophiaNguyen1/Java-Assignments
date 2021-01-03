/**
Sophia Nguyen
Ms. Krasteva
Sept. 21, 2018
This assignment displays a twelve line six times table.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class ForLoops1 //creates a new class called ForLoops1
{
    Console c; //creates an instance variable of Console class so the output window can be made
    int startValue;
    public ForLoops1 ()  //ForLoops1 class constructor
    {
	c = new Console ("12 Line 6 Times Table"); //creates a new Console object window and names it
    }


    public void displayTitle ()  //displayTitle method
    {
	c.print (' ', 30);
	c.println ("12 Line 6 Times Table"); //title
    }


    public void displayIntro ()  //displayIntro method
    {
	c.println ("This program will create a 12 line 6 times table starting at a number that you  choose.");
    }


    public void input ()  //input method
    {
	c.print ("Please enter the starting value that the base will be multiplied by. ");
	startValue = c.readInt (); //reads user input and stores it into the variable startValue
    }


    public void output ()  //output method
    {
	c.print (' ', 17);
	c.print ("Base", 19);
	c.print ("Value", 19);
	c.println ("Result");
	for (int num = startValue ; num <= startValue + 12 ; num++) //for loop
	{
	    c.print (6, 20);
	    c.print (' ', 9);
	    c.print ("X");
	    c.print (num, 9);
	    c.print (' ', 9);
	    c.print ("=", 9);
	    c.println (num * 6);
	}
    }


    public static void main (String[] args)  //main method
    {
	ForLoops1 f = new ForLoops1 (); //creates instance variable of ForLoops1 and constructs a new ForLoops1 object
	f.displayTitle (); //executes displayTitle method
	f.displayIntro (); //executes displayTable method
	f.input (); // executes input method
	f.output (); //executes output method
    }
}
