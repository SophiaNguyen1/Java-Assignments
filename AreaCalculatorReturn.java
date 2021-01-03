/**
Sophia Nguyen
Area Calculator
Ms. Krasteva
Nov. 1, 2018
This program calculates the area of a circle, rectangle, or triangle.

The first screen is the intro screen, which explains the program.
The second screen is the askData screen, which gets our input for which shape we want to calculate and its dimensions.
The third screen is the display screen, which calculates the area and displays it.
The fourth screen is the goodbye screen, which thanks us for using the program and displays the programmer's name.

In order to go to the askData screen from the intro screen, we must press the 'c' key to continue.
In order to go to the goodbye screen from the intro screen, we must press any key other than 'c'.
In order to go to the display screen from the askData screen, we must correctly input the shape that we want to calculate and its dimensions.
In order to go to the goodbye screen from the display screen, we must press any key.

Variable Dictionary
Name        Type        Purpose
key         char        stores the key that users press in intro and pauseProgram
shape       String      stores the string of the shape that the user enters
radius      double      stores the radius of the circle
length      double      stores the length of the rectangle
width       double      stores the width of the rectangle
base        double      stores the base of the triangle
height      double      stores the height of the triangle
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file
import javax.swing.JOptionPane; //gives access to J Option Pane

public class AreaCalculatorReturn //creates a new class called AreaCalculatorReturn
{
    Console c; //creates an instance variable of Console class so the output window can be made
    //global variable declarations
    char key; //char
    String shape = " "; //string
    double radius = 0, length = 0, width = 0, base = 0, height = 0, area = 0; //double
    /*
    This method is the class constructor of the program and it .
    */
    public AreaCalculatorReturn ()  //AreaCalculatorReturn class constructor
    {
	c = new Console ("Area Calculator"); //creates a new Console object window
    }


    /*
    This method creates the title of the program.
    */
    private void title ()  //title method
    {
	c.clear (); //clears screen
	c.print (' ', 32);
	c.println ("Area Calculator");
	c.println ();
    }


    /*
    This method of the program displays a message to press any key to continue and waits for us to press a key.
    */
    private void pauseProgram ()  //pauseProgram method
    {
	c.print ("Press any key to continue. ");
	c.getChar (); //waits for the user to input a char
    }


    /*
    This method creates the introduction of the program. It explains the program to us, displays graphics, and waits for us to press a key to continue.
    Variable Dictionary
    Name        Type        Purpose
    a           int         stores x coordinates for triangle
    b           int         stores y coordinates for triangle
    */
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
	//ruler
	c.setColor (Color.yellow);
	c.fillRect (50, 300, 260, 40);
	//ruler lines
	c.setColor (Color.black);
	c.drawLine (55, 300, 55, 315); //line 1
	c.drawLine (65, 300, 65, 315); //2
	c.drawLine (75, 300, 75, 315); //3
	c.drawLine (85, 300, 85, 315); //4
	c.drawLine (95, 300, 95, 315); //5
	c.drawLine (105, 300, 105, 315); //6
	c.drawLine (115, 300, 115, 315); //7
	c.drawLine (125, 300, 125, 315); //8
	c.drawLine (135, 300, 135, 315); //9
	c.drawLine (145, 300, 145, 315); //10
	c.drawLine (155, 300, 155, 315); //11
	c.drawLine (165, 300, 165, 315); //12
	c.drawLine (175, 300, 175, 315); //13
	c.drawLine (185, 300, 185, 315); //14
	c.drawLine (195, 300, 195, 315); //15
	c.drawLine (205, 300, 205, 315); //16
	c.drawLine (215, 300, 215, 315); //17
	c.drawLine (225, 300, 225, 315); //18
	c.drawLine (235, 300, 235, 315); //19
	c.drawLine (245, 300, 245, 315); //20
	c.drawLine (255, 300, 255, 315); //21
	c.drawLine (265, 300, 265, 315); //22
	c.drawLine (275, 300, 275, 315); //23
	c.drawLine (285, 300, 285, 315); //24
	c.drawLine (295, 300, 295, 315); //25
	c.drawLine (305, 300, 305, 315); //26
	//calculator
	c.setColor (Color.gray);
	c.fillRect (500, 270, 100, 200); //base
	c.setColor (Color.lightGray);
	c.fillRect (510, 280, 80, 30); //screen
	c.fillRect (510, 320, 20, 20); //button 1
	c.fillRect (540, 320, 20, 20); //button 2
	c.fillRect (570, 320, 20, 20); //button 3
	c.fillRect (510, 350, 20, 20); //button 4
	c.fillRect (540, 350, 20, 20); //button 5
	c.fillRect (570, 350, 20, 20); //button 6
	c.fillRect (510, 380, 20, 20); //button 7
	c.fillRect (540, 380, 20, 20); //button 8
	c.fillRect (570, 380, 20, 20); //button 9
	c.fillRect (510, 410, 20, 20); //button 10
	c.fillRect (540, 410, 20, 20); //button 11
	c.fillRect (570, 410, 20, 20); //button 12
	//text
	c.println ("Welcome to the Area Calculator program. This program will calculate the area of either a circle, rectangle, or triangle, after you input its appropriate");
	c.println ("measurements.");
	c.println ();
	c.print ("Press 'c' to continue. Press any other key to exit. ");
	key = c.getChar (); //gets key
    }


    /*
    This method is the askData method of the program. It gets the input for which shape to calculate the area of and its dimensions.
    There is an if statement that asks for further input depending on whether we entered 'circle', 'rectangle', or 'triangle' for the shape. It displays an error message and calls askData if we did not enter one of the three shapes.
    There are five if statements inside the previous if statement. It displays an error message and calls askData if we do not enter a positive number for the dimensions of our chosen shape.
    There are three if statements inside the main if statement. It gets user input if we haven't entered it yet or our last answer was wrong. It prints our answer if it was entered correctly.
    */
    public void askData ()  //askData method
    {
	title ();
	//string variable declarations
	String radiusStr, lengthStr, widthStr, baseStr, heightStr;
	//shape user input
	c.println ("Which shape do you want to calculate the area of?");
	while (true)
	{
	    c.setCursor (4, 1);
	    c.print ("Please enter 'circle', 'rectangle', or 'triangle': ");
	    c.println ();
	    c.setCursor (4, 52);
	    shape = c.readString (); //gets shape string
	    //if shape input is invalid
	    if (!(shape.equalsIgnoreCase ("circle") || shape.equals ("rectangle") || shape.equals ("triangle")))
	    {
		//error message
		JOptionPane.showMessageDialog (null, "You must enter 'circle', 'rectangle', or 'triangle'.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	    else
	    {
		break; //exits the loop
	    }
	}
	//when the shape input is circle
	while (shape.equalsIgnoreCase ("circle"))
	{
	    c.setCursor (5, 1);
	    c.print ("Please enter the radius of the circle: ");
	    c.println ();
	    c.setCursor (5, 40);
	    //try catch block
	    try
	    {
		//gets radius string
		radiusStr = c.readString ();
		//converts radius string to double
		radius = Double.parseDouble (radiusStr);
		//if the radius is 0 or negative
		if (radius <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
		    break; //exits the loop
		}
	    }
	    //catches the error if input cannot be converted to double
	    catch (NumberFormatException e)
	    {
		//error message
		JOptionPane.showMessageDialog (null, "That is not a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
	//when the shape input is rectangle
	while (shape.equalsIgnoreCase ("rectangle"))
	{
	    c.setCursor (5, 1);
	    c.print ("Please enter the length of the rectangle: ");
	    c.println ();
	    c.setCursor (5, 43);
	    //try catch block
	    try
	    {
		//gets length string
		lengthStr = c.readString ();
		//converts length string to double
		length = Double.parseDouble (lengthStr);
		//if length is 0 or negative
		if (length <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
		    break; //exits the loop
		}
	    }
	    //catches the error if input cannot be converted to double
	    catch (NumberFormatException e)
	    {
		//error message
		JOptionPane.showMessageDialog (null, "That is not a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
	//when the length is positive
	while (length > 0)
	{
	    c.setCursor (6, 1);
	    c.print ("Please enter the width of the rectangle: ");
	    c.println ();
	    c.setCursor (6, 42);
	    //try catch block
	    try
	    {
		//gets width string
		widthStr = c.readString ();
		//converts width string to double
		width = Double.parseDouble (widthStr);
		//if width is 0 or negative
		if (width <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
		    break; //exits the loop
		}
	    }
	    //catches the error if input cannot be converted to double
	    catch (NumberFormatException e)
	    {
		//error message
		JOptionPane.showMessageDialog (null, "That is not a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	//when the shape input is triangle
	while (shape.equalsIgnoreCase ("triangle"))
	{
	    c.setCursor (5, 1);
	    c.print ("Please enter the base of the triangle: ");
	    c.println ();
	    c.setCursor (5, 40);
	    //try catch block
	    try
	    {
		//gets base string
		baseStr = c.readString ();
		//converts base string to double
		base = Double.parseDouble (baseStr);
		//if base is 0 or negative
		if (base <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
		    break; //exits the loop
		}
	    }
	    //catches the error if input cannot be converted to double
	    catch (NumberFormatException e)
	    {
		//error message
		JOptionPane.showMessageDialog (null, "That is not a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

	//when the base is positive
	while (base > 0)
	{
	    c.setCursor (6, 1);
	    c.print ("Please enter the height of the triangle: ");
	    c.println ();
	    c.setCursor (6, 42);
	    //try catch block
	    try
	    {
		//gets height string
		heightStr = c.readString ();
		//converts height string to double
		height = Double.parseDouble (heightStr);
		//if height is 0 or negative
		if (height <= 0)
		{
		    //error message
		    JOptionPane.showMessageDialog (null, "You must enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
		    break; //exits the loop
		}
	    }
	    //catches the error if input cannot be converted to double
	    catch (NumberFormatException e)
	    {
		//error message
		JOptionPane.showMessageDialog (null, "That is not a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }


    //Return method
    private double area ()
    {
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
	return area;
    }


    /*
    This method is the display method of the program. It calculates the area of the shape and displays it.
    Variable Dictionary
    Name        Type        Purpose
    area        double      stores the area of the shape
    There is a conditional statement that calculates the area depending on which shape we chose.
    */
    public void display ()  //display method
    {
	title ();
	//output statement
	c.println ("The area of the " + shape + " is " + area () + " units squared.");
	c.println ();
	pauseProgram (); //calls pauseProgram
    }


    /*
    This method is the goodbye method of the program. It thanks the user for using the program and signifies the ending of the program.
    */
    public void goodbye ()  //goodbye method
    {
	title ();
	c.println ("Thank you for using the Area Calculator program.");
	c.println ();
	c.print ("Programmed by Sophia Nguyen.");
    }


    /*
    This method is the main method of the program. It creates an instance variable of the program calls the methods of the program in a specific order.
    There is a conditional statement to display the askData and display method if the user chooses to continue in the intro. If the user chooses to not continue, the program goes straight to goodbye.
    */
    public static void main (String[] args)  //main method
    {
	AreaCalculatorReturn a = new AreaCalculatorReturn (); //creates instance variable of AreaCalculatorReturn and constructs a new AreaCalculatorReturn object
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
