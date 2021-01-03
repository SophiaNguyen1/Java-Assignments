/**
Sophia Nguyen
Ms. Krasteva
Nov. 1, 2018
This program calculates the area of a circle, rectangle, or triangle.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import hsa.Message;
import javax.swing.JOptionPane; //gives access to J Option Pane

public class AreaCalculator //creates a new class called AreaCalculator
{
    Console c; //creates an instance variable of Console class so the output window can be made
    //global variable declarations
    char key; //char
    String shape; //string
    double radius = 0, length = 0, width = 0, base = 0, height = 0; //double
    public AreaCalculator ()  //AreaCalculator class constructor
    {
	c = new Console ("Area Calculator"); //creates a new Console object window
    }


    private void title ()  //title method
    {
	c.clear (); //clears screen
	c.print (' ', 32);
	c.println ("Area Calculator");
	c.println ();
    }


    private void pauseProgram ()  //pauseProgram method
    {
	c.print ("Press any key to continue. ");
	c.getChar (); //waits for the user to input a char
    }


    public void intro ()  //intro method
    {
	title ();
	//graphics
	c.setColor (Color.pink);
	//circle
	c.fillOval (30, 380, 100, 100);
	//rectangle
	c.fillRect (160, 390, 130, 75);
	//triangle
	int a[] = {320, 370, 420}; //x-coordinates
	int b[] = {470, 380, 470}; //y-coordinates
	c.fillPolygon (a, b, 3);
	//text
	c.println ("Welcome to the Area Calculator program. This program will calculate the area of either a circle, rectangle, or triangle, after you input its appropriate");
	c.println ("measurements.");
	c.println ();
	c.print ("Press 'c' to continue. Press any other key to exit. ");
	key = c.getChar (); //gets key
    }


    public void askData ()  //askData method
    {
	title ();
	//shape user input
	c.println ("Which shape do you want to calculate the area of?");
	c.println ("Please enter 'circle', 'rectangle', or 'triangle'.");
	shape = c.readString (); //gets shape
	//if statement
	//circle user input
	while (shape.equals ("circle"))
	{
	    try
	    {
		c.print ("Please enter the radius of the circle: ");
		radius = c.readDouble (); //gets radius
		//errortrap
		while (radius <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		    askData (); //calls askData
		}
		catch
		{
		}
	    }
	}
	//rectangle user input
	while (shape.equals ("rectangle"))
	{
	    c.print ("Please enter the length of the rectangle: ");
	    length = c.readDouble (); //gets length
	    //errortrap
	    while (length <= 0)
	    {
		//error message
		JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		askData (); //calls askData
	    }
	    else
	    {
		c.print ("Please enter the width of the rectangle: ");
		width = c.readDouble (); //gets width
		//errortrap
		while (width <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		    askData (); //calls askData
		}
	    }
	}
	//triangle user input
	while (shape.equals ("triangle"))
	{
	    c.print ("Please enter the base of the triangle: ");
	    base = c.readDouble (); //gets base
	    //errortrap
	    while (base <= 0)
	    {
		//error message
		JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		askData (); //calls askData
	    }
	    else
	    {
		c.print ("Please enter the height of the triangle: ");
		height = c.readDouble (); //gets height
		//errortrap
		if (height <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		    askData (); //calls askData
		}
	    }
	}
	//shape errortrap
	else
	{
	    //error message
	    JOptionPane.showMessageDialog (null, "You must enter 'circle', 'rectangle', or 'triangle'.", "Error", JOptionPane.ERROR_MESSAGE);
	    askData (); //calls askData
	}
    }



    public void display ()  //display method
    {
	//local variable declaration
	double area;
	title ();
	//if statements for area calculations
	if (shape.equals ("circle"))
	{
	    area = Math.PI * radius * radius;
	}


	else if (shape.equals ("rectangle"))
	{
	    area = length * width;
	}


	else
	{
	    area = base * height / 2;
	}


	//output statement
	c.println ("The area of the " + shape + " is " + area + " units squared.");
	c.println ();
	pauseProgram (); //calls pauseProgram
    }


    public void goodbye ()  //goodbye method
    {
	title ();
	c.println ("Thank you for using the Area Calculator program.");
	c.println ();
	c.print ("Programmed by Sophia Nguyen.");
    }


    public static void main (String[] args)  //main method
    {
	AreaCalculator a = new AreaCalculator (); //creates instance variable of AreaCalculator and constructs a new AreaCalculator object
	a.intro (); //executes intro method
	//if statement (if the user chooses to continue)
	if (a.key == 'c')
	{
	    a.askData (); //executes askData method
	    a.display (); //executes display method
	}


	a.goodbye (); //executes goodbye method
    }
}
