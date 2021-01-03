/**
Sophia Nguyen
Ms. Krasteva
Sept. 14, 2018
This assignment displays my name in several different ways.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class MyName //creates a new class called MyName
{
    Console c; //creates an instance variable of Console class so the output window can be made
    String lastName = "Nguyen"; //declares a global string variable for my last name and assigns it a string
    public MyName ()  //MyName class constructor
    {
	c = new Console ("My Name Displayed in Different Ways"); //creates a new Console object window and names it

    }


    public void drawTitle ()  //drawTitle method
    {
	c.print (' ', 36);
	c.print ("My Name");
	c.println ();
    }


    public void displayData ()  //displayData method
    {
	String firstName = "Sophia"; //declares a local string variable for my first name and assigns it a string
	c.println (firstName.toLowerCase ()); //prints my first name in all lower case
	c.println (lastName.toUpperCase ()); //prints my last name in all upper case
    }


    public void displayName ()  //displayName method
    {
	c.println (lastName.charAt (0)); //prints first character of my last name
	c.println (lastName.charAt (1)); //prints second character of my last name
	c.println (lastName.charAt (2)); //prints third character of my last name
	c.println (lastName.charAt (3)); //prints fourth character of my last name
	c.println (lastName.charAt (4)); //prints fifth character of my last name
	c.print (lastName.charAt (5)); //prints sixth character of my last name
    }


    public static void main (String[] args)  //main method
    {
	MyName m = new MyName (); //creates instance variable of MyName and constructs a new MyName object
	m.drawTitle (); //executes drawTitle method
	m.displayData (); //executes displayData method
	m.displayName (); //executes displayName method
    }
}

//Sources
//I used this website to learn how to use uppercase and lowercase methods
//https://www.guru99.com/java-string-tolowercase-methods.html
