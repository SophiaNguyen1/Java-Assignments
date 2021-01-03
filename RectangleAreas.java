/**
Sophia and Alyssa
Ms. Krasteva
Sept. 18, 2018
This program calculates the area of rectangles.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class RectangleAreas //creates a new class called RectangleAreas
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public RectangleAreas ()  //RectangleAreas class constructor
    {
	c = new Console (); //creates a new Console object window
    }


    public void drawTitle ()  //drawTitle method
    {
	c.print (' ', 28);
	c.println ("Rectangle Area Calculator");
	c.println ();
    }


    public void inputOutput ()  //inputOutput method
    {
	double length, width, area;
	c.println ("Please enter the length of the rectangle.");
	length = c.readDouble ();
	c.println ("Please enter the width of the rectangle.");
	width = c.readDouble ();
	area = length * width;
	c.print ("The area of the rectangle is " + area + " units squared.");


    }


    public static void main (String[] args)  //main method
    {
	RectangleAreas r = new RectangleAreas (); //creates instance variable of TestMarks and constructs a new TestMarks object
	r.drawTitle (); //executes drawTitle method
	r.inputOutput (); //executes inputOutput method
    }
}

