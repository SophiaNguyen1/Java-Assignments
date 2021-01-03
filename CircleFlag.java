/**
Sophia Nguyen
Ms. Krasteva
Oct. 2, 2018
This assignment displays a 200 x 100 pixel flag with a perfect circle in the center.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class CircleFlag  //creates a new class called CircleFlag
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public CircleFlag ()  //class constructor
    {
	c = new Console ("A 200 X 100 Pixel Flag with a Centered Circle"); //creates a new Console object window and names it
    }


    public void output ()  //output method
    {
	c.drawLine (220, 200, 420, 200); //top line
	c.drawLine (220, 300, 420, 300); //bottom line
	c.drawLine (220, 200, 220, 300); //left line
	c.drawLine (420, 200, 420, 300); //right line
	c.drawOval (305, 235, 30, 30); //circle
    }


    public static void main (String[] args)  //main method
    {
	CircleFlag c = new CircleFlag (); //creates instance variable of CircleFlag and constructs a new CircleFlag object
	c.output (); //executes output method
    }
}
