/**
Sophia Nguyen
Ms. Krasteva
Dec. 3, 2018
This program will generate numbers from 40 to 60 and display the numbers that are higher than 50.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class RandomValues //creates a new class called RandomValues
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public RandomValues ()  //RandomValues class constructor
    {
	c = new Console (); //creates a new Console object window
    }


    public void display ()  //display method
    {
	//array declaration
	int[] values = new int [10];
	//loop runs through each element of the array
	for (int i = 0 ; i < 10 ; i++)
	{
	    //stores a random int from 40 to 60 in values array
	    values [i] = (int) (Math.random () * 21 + 30) + 10;
	    if (values [i] > 50) //if the value is greater than 50
	    {
		c.println (values [i]); //prints value to the console
	    }
	}
    }


    public static void main (String[] args)  //main method
    {
	RandomValues r = new RandomValues (); //creates instance variable of RandomValues and constructs a new RandomValues object
	r.display (); //executes display method
    }
}

