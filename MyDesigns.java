/** Name: Sophia Nguyen
    Teacher: Ms. Krasteva
    Date: Sept. 11, 2018
    Assignment: This program displays a design of a diamond and a parallelogram.
*/

import hsa.Console;                         //gives access to java command libraries
import java.awt.*;                          //gives access to Console class file

public class MyDesigns                      //creates a new class called MyDesigns
{ //creates an instance variable of Console
    Console c;                              //class so the output window can be made
    public void drawTitle ()                //drawTitle method
    {
	c.print (' ', 36);
	c.println ("Designs");
	c.println ();
    }


    public void drawParallelogram ()        //drawParallelogram method
    {
	c.print (' ', 33);
	c.println ("PARALLELO");
	c.print (' ', 34);
	c.print ("A");
	c.print (' ', 7);
	c.println ("G");
	c.print (' ', 35);
	c.print ("R");
	c.print (' ', 7);
	c.println ("R");
	c.print (' ', 36);
	c.print ("A");
	c.print (' ', 7);
	c.println ("A");
	c.print (' ', 37);
	c.println ("LLELOGRAM");
    }


    public void drawDiamond ()              //drawDiamond method
    {
	c.print (' ', 39);
	c.println ("D");
	c.print (' ', 38);
	c.println ("III");
	c.print (' ', 37);
	c.println ("AAAAA");
	c.print (' ', 36);
	c.println ("MMMMMMM");
	c.print (' ', 37);
	c.println ("OOOOO");
	c.print (' ', 38);
	c.println ("NNN");
	c.print (' ', 39);
	c.println ("D");
	c.println ();
    }


    public MyDesigns ()                     //MyDesigns class constructor
    {
	c = new Console ();                 //creates a new Console object window
    }


    public static void main (String[] args)  //main method of a Java application
    { //creates instance variable of MyDesigns
	MyDesigns d;                        //constructs a new MyDesigns object
	d = new MyDesigns ();               //executes drawTitle method
	d.drawTitle ();                     //executes drawDiamond method
	d.drawDiamond ();                   //executes drawParalleloram method
	d.drawParallelogram ();
    }
}
