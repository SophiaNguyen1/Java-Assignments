/**
Sophia Nguyen
Ms. Krasteva
Oct. 2, 2018
This assignment displays a 200 x 100 pixel rectangle created from 4 lines.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class DrawRectangle  //creates a new class called DrawRectangle
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public DrawRectangle ()  //class constructor
    {
	c = new Console ("A 200 x 100 Pixel Rectangle"); //creates a new Console object window and names it
    }


    public void output ()  //output method
    {
	c.drawLine (220, 200, 420, 200); //top line
	c.drawLine (220, 300, 420, 300); //bottom line
	c.drawLine (220, 200, 220, 300); //left line
	c.drawLine (420, 200, 420, 300); //right line
    }


    public static void main (String[] args)  //main method
    {
	DrawRectangle d = new DrawRectangle (); //creates instance variable of DrawRectangle and constructs a new DrawRectangle object
	d.output (); //executes output method
    }
}

