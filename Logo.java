/*
Sophia Nguyen
Ms. Krasteva
Oct. 2, 2018
This program displays a logo for the ICS3U class.
*/

import hsa.Console; //gives access to the java command libraries
import java.awt.*; //gives access to the Console class file

public class Logo  //creates a new class called Logo
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public Logo ()  //class constructor
    {
	c = new Console ("ICS3U Logo"); //creates a new Console object window and names it
    }


    public void displayLogo ()  //displayLogo method
    {
	//background
	Color backgroundColor = new Color (218, 220, 242); //creates background colour
	c.setColor (backgroundColor); //sets background colour
	c.fillRect (9, 9, 800, 800); //draws background
	//circle
	Color Color1 = new Color (131, 221, 255);
	c.setColor (Color1);
	c.fillOval (120, 50, 400, 400);
	//title
	c.setFont (new Font ("Arial", Font.BOLD, 100)); //title font
	Color titleColor1 = new Color (58, 122, 50); //title colour 1
	c.setColor (titleColor1); //sets title colour
	c.drawString ("ICS3U", 170, 400); //draws title
	Color titleColor2 = new Color (184, 237, 210); //title colour 2
	c.setColor (titleColor2); //sets title colour
	c.drawString ("ICS3U", 177, 400); //draws title
	//lines
	c.setColor (Color.white); //sets line color
	c.drawLine (190, 310, 450, 310); //top line
	c.drawLine (190, 410, 450, 410); //bottom line
	//block
	Color blockColor = new Color (70, 95, 196);
	c.setColor (blockColor);
	c.fillRect (220, 95, 200, 200);
	//star
	Color starColor = new Color (249, 217, 87);
	c.setColor (starColor);
	c.fillStar (220, 95, 200, 200);

    }


    public static void main (String[] args)  //main method
    {
	Logo l = new Logo (); //creates instance variable of Logo and constructs a new Logo object
	l.displayLogo (); //executes displayLogo method
    }
}
