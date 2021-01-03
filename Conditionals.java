/**
Sophia Nguyen
Ms. Krasteva
Oct. 23, 2018
This program gets 3 integers from the user and outputs the largest value.
*/
import java.awt.*;
import hsa.Console;

public class Conditionals
{
    Console c;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;

    public Conditionals ()
    {
	c = new Console ();
    }


    public void askData ()
    {
	drawTitle ();
	c.print ("Please enter the first integer. ");
	num1 = c.readInt ();
	c.print ("Please enter the second integer. ");
	num2 = c.readInt ();
	c.print ("Please enter the third integer. ");
	num3 = c.readInt ();
    }


    public void displayData ()
    {
	if (num1 > num2 && num1 > num3)
	    c.println ("The largest value is " + num1);
	else if (num2 > num1 && num2 > num3)
	    c.println ("The largest value is " + num2);
	else
	    c.println ("The largest value is " + num3);
    }


    private void drawTitle ()
    {
	c.print (' ', 34);
	c.println ("Conditionals");
	c.println ("");
    }


    public static void main (String[] args)
    {
	Conditionals d = new Conditionals ();
	d.askData ();
	d.displayData ();

    }
}
