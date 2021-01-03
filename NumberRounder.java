/**
Sophia and Alyssa
Ms. Krasteva
Sept. 18, 2018
This program rounds numbers to the nearest 1, 10, 100, or 1000.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class NumberRounder //creates a new class called NumberRounder
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public NumberRounder ()  //NumberRounder class constructor
    {
	c = new Console (); //creates a new Console object window
    }


    public void drawTitle ()  //drawTitle method
    {
	c.print (' ', 34);
	c.println ("Number Rounder");
	c.println ();
    }


    public void inputOutput ()  //inputOutput method
    {
	double number, answer;
	int roundTo;
	c.println ("Please enter the number you want to round.");
	number = c.readDouble ();
	c.println ("Please indicate how you want the number to be rounded to: to the nearest 1, 10, 100, or 1000.");
	roundTo = c.readInt ();
	answer = Math.round (number / roundTo) * roundTo;
	c.print ("The number " + number + " rounded to the nearest " + roundTo + " is ");
	c.print (answer);
    }


    public static void main (String[] args)  //main method
    {
	NumberRounder n = new NumberRounder (); //creates instance variable of NumberRounder and constructs a new NumberRounder object
	n.drawTitle (); //executes drawTitle method
	n.inputOutput (); //executes inputOutput method
    }
}


