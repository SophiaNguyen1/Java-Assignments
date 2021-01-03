/**
Sophia Nguyen
Ms. Krasteva
Oct. 2, 2018
This assignment displays a 200 x 100 pixel flag.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class DrawFlag  //creates a new class called DrawFlag
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public DrawFlag ()  //class constructor
    {
	c = new Console ("A 200 x 100 Pixel Flag"); //creates a new Console object window and names it
    }


    public void output ()  //output method
    {
	c.drawRect (220, 200, 200, 100); //rectangle
	c.drawLine (244, 200, 244, 300); //vertical line
	c.drawLine (220, 213, 420, 213); //horizontal line
    }


    public static void main (String[] args)  //main method
    {
	DrawFlag d = new DrawFlag (); //creates instance variable of DrawFlag and constructs a new DrawFlag object
	d.output (); //executes output method
    }
}
