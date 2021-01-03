/**
Alyssa and Sophia
Ms. Krasteva
Oct. 2, 2018
This assignment displays a virtual bead loom design created using a loop.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class beadLoom  //creates a new class called beadLoom
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public beadLoom ()  //class constructor
    {
	c = new Console ("A Virtual Bead Loom Design"); //creates a new Console object window and names it
    }


    public void output ()  //output method
    {
	//names
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ();
	c.println ("Alyssa and Sophia");
	//base of design
	c.setColor (Color.black);
	for (int y = 0 ; y < 400 ; y = y + 20)
	{
	    for (int x = 0 ; x < 400 ; x = x + 20)
	    {

		c.fillRect (120 + x, 50 + y, 20, 20); //background block
		//delay
		try
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{
		}

	    }

	}

	Color color1 = new Color (255, 215, 0); //yellow
	c.setColor (color1);
	for (int y = 0 ; y < 40 ; y = y + 20)
	{
	    for (int x = 0 ; x < 200 ; x = x + 20)
	    {
		c.fillRect (220, 50 + y, 20, 20); //top left block
		c.fillRect (400, 50 + y, 20, 20); //top right block
		c.fillRect (220, 410 + y, 20, 20); //bottom left block
		c.fillRect (400, 410 + y, 20, 20); //bottom right block
		c.fillRect (120 + y, 150, 20, 20); //left upper block
		c.fillRect (480 + y, 150, 20, 20); //right upper block
		c.fillRect (120 + y, 330, 20, 20); //left lower block
		c.fillRect (480 + y, 330, 20, 20); //right lower block
		c.fillRect (300 + y, 230, 20, 20); //center upper block
		c.fillRect (300 + y, 250, 20, 20); //center lower block
		c.fillRect (300 - x, 50 + x, 20, 20); //top left diagonal
		c.fillRect (320 + x, 50 + x, 20, 20); //top right diagonal
		c.fillRect (120 + x, 250 + x, 20, 20); //bottom left diagonal
		c.fillRect (500 - x, 250 + x, 20, 20); //bottom right diagonal
		//delay
		try
		{
		    Thread.sleep (20);
		}
		catch (Exception e)
		{
		}

	    }

	}

	Color color2 = new Color (0, 128, 0); //green
	c.setColor (color2);
	for (int y = 0 ; y < 40 ; y = y + 20)
	{
	    c.fillRect (300 + y, 70, 20, 20); //1st block from top
	    c.fillRect (260 + y, 110, 20, 20); //2nd block from top, left
	    c.fillRect (340 + y, 110, 20, 20); //2nd block from top, right
	    c.fillRect (220 + y, 150, 20, 20); //3rd block from top, left
	    c.fillRect (380 + y, 150, 20, 20); //3rd block from top, right
	    c.fillRect (180 + y, 190, 20, 20); //4th block from top, left
	    c.fillRect (420 + y, 190, 20, 20); //4th block from top, right
	    c.fillRect (140 + y, 230, 20, 20); //5th block from top, left
	    c.fillRect (460 + y, 230, 20, 20); //5th block from top, right
	    c.fillRect (140 + y, 250, 20, 20); //6th block from top, left
	    c.fillRect (460 + y, 250, 20, 20); //6th block from top, right
	    c.fillRect (180 + y, 290, 20, 20); //7th block from top, left
	    c.fillRect (420 + y, 290, 20, 20); //7th block from top, right
	    c.fillRect (220 + y, 330, 20, 20); //7th block from top, left
	    c.fillRect (380 + y, 330, 20, 20); //7th block from top, right
	    c.fillRect (260 + y, 370, 20, 20); //7th block from top, left
	    c.fillRect (340 + y, 370, 20, 20); //7th block from top, right
	    c.fillRect (300 + y, 410, 20, 20); //bottom block
	    //delay
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }

	}

	Color color3 = new Color (135, 206, 235); //light blue
	c.setColor (color3);
	for (int y = 0 ; y < 40 ; y = y + 20)
	{
	    for (int x = 0 ; x < 100 ; x = x + 20)
	    {
		c.fillRect (200 + x, 250, 20, 20); //upper left from center
		c.fillRect (200 + x, 230, 20, 20); //lower left from center
		c.fillRect (340 + x, 250, 20, 20); //upper right from center
		c.fillRect (340 + x, 230, 20, 20); //lower right from center
		c.fillRect (260, 170 + y, 20, 20); //vertical top left blue strip beside red
		c.fillRect (360, 170 + y, 20, 20); //vertical top right blue strip beside red
		c.fillRect (260, 290 + y, 20, 20); //vertical bottom left blue strip beside red
		c.fillRect (360, 290 + y, 20, 20); //vertical bottom right blue strip beside red
		c.fillRect (240 + x / 4, 190, 20, 20); //upper left from center red
		c.fillRect (240 + x / 4, 290, 20, 20); //lower left from center red
		c.fillRect (360 + x / 4, 190, 20, 20); //upper right from center red
		c.fillRect (360 + x / 4, 290, 20, 20); //lower right from center red
		c.fillRect (180, 70 + y, 20, 40); //blue diamond half top right
		c.fillRect (180, 370 + y, 20, 40); //blue diamond half bottom right
		c.fillRect (460, 70 + y, 20, 40); //blue diamond half top right
		c.fillRect (460, 370 + y, 20, 40); //blue diamond half bottom right
		c.fillRect (200, 90 + y / 10, 20, 20); //blue diamond half top right side part
		c.fillRect (200, 390 + y / 10, 20, 20); //blue diamond half bottom right side part
		c.fillRect (480, 90 + y / 10, 20, 20); //blue diamond half top right side part
		c.fillRect (480, 390 + y / 10, 20, 20); //blue diamond half bottom right side part
		//delay
		try
		{
		    Thread.sleep (20);
		}
		catch (Exception e)
		{
		}
	    }

	}


	Color color4 = new Color (204, 153, 255); //purple
	c.setColor (color4);
	for (int y = 0 ; y < 100 ; y = y + 20)
	{
	    for (int x = 0 ; x < 80 ; x = x + 20)
	    {

		c.fillRect (300, 130 + y, 20, 20); //middle vertical top purple block (left)
		c.fillRect (320, 130 + y, 20, 20); //middle vertical top purple block (right)
		c.fillRect (300, 270 + y, 20, 20); //middle vertical bottom purple block (left)
		c.fillRect (320, 270 + y, 20, 20); //middle vertical bottom purple block (right)
		c.fillRect (280 + x, 90, 20, 20); //top block
		c.fillRect (240 + x / 2, 130, 20, 20); //1st block from top, left
		c.fillRect (350 + x / 2, 130, 20, 20); //1st block from top, right
		c.fillRect (200 + x / 2, 170, 20, 20); //2nd block from top, left
		c.fillRect (390 + x / 2, 170, 20, 20); //2nd block from top, right
		c.fillRect (160 + x / 2, 210, 20, 20); //3rd block from top, left
		c.fillRect (430 + x / 2, 210, 20, 20); //3rd block from top, right
		c.fillRect (160 + x / 2, 270, 20, 20); //3rd block from top, left
		c.fillRect (430 + x / 2, 270, 20, 20); //3rd block from top, right
		c.fillRect (200 + x / 2, 310, 20, 20); //4th block from top, left
		c.fillRect (390 + x / 2, 310, 20, 20); //4th block from top, right
		c.fillRect (240 + x / 2, 350, 20, 20); //3rd block from top, left
		c.fillRect (350 + x / 2, 350, 20, 20); //3rd block from top, right
		c.fillRect (280 + x, 390, 20, 20);  //bottom block
		c.fillRect (160, 70 + y / 2, 20, 20); //diamond half top left
		c.fillRect (160, 370 + y / 2, 20, 20); //diamond half bottom left
		c.fillRect (440, 70 + y / 2, 20, 20); //diamond half top left
		c.fillRect (440, 370 + y / 2, 20, 20); //diamond half bottom left
		c.fillRect (140, 90 + y / 30, 20, 20); //diamond half top left side block
		c.fillRect (140, 390 + y / 30, 20, 20); //diamond half bottom left side block
		c.fillRect (420, 90 + y / 30, 20, 20); //diamond half top left side block
		c.fillRect (420, 390 + y / 30, 20, 20); //diamond half bottom left side block
		//delay
		try
		{
		    Thread.sleep (20);
		}
		catch (Exception e)
		{
		}
	    }

	}


	Color color5 = new Color (139, 0, 0); //red
	c.setColor (color5);
	for (int y = 0 ; y < 140 ; y = y + 20)
	{

	    c.fillRect (300 - y, 110 + y, 20, 20); //top left diagonal
	    c.fillRect (320 + y, 110 + y, 20, 20); //top right diagonal
	    c.fillRect (180 + y, 250 + y, 20, 20); //bottom left diagonal
	    c.fillRect (440 - y, 250 + y, 20, 20); //bottom right diagonal
	    c.fillRect (280, 150 + y / 2, 20, 20); //vertical top left red strip beside blue
	    c.fillRect (340, 150 + y / 2, 20, 20); //vertical top right red strip beside blue
	    c.fillRect (280, 270 + y / 2, 20, 20); //vertical bottom left red strip beside blue
	    c.fillRect (340, 270 + y / 2, 20, 20); //vertical bottom right red strip beside blue
	    c.fillRect (200 + y / 2, 210, 20, 20); //upper left from center blue
	    c.fillRect (200 + y / 2, 270, 20, 20); //lower left from center blue
	    c.fillRect (340 + y / 2, 210, 20, 20); //upper right from center blue
	    c.fillRect (340 + y / 2, 270, 20, 20); //lower right from center blue
	    //delay
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }


	}
    }


    public static void main (String[] args)  //main method
    {
	beadLoom b = new beadLoom (); //creates instance variable of beadLoom and constructs a new beadLoom object
	b.output (); //executes output method
    }
}



