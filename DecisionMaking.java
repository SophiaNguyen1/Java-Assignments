/**
Sophia Nguyen
Ms. Krasteva
Oct. 25, 2018
This program contains 6 programs that perform different functions.
The first program determines if the number of vowels in a given sentence is greater than the number of consonants.
The second program determines if you should sleep in, depending on the day of the week and whether you're on vacation.
The third program checks your postal package and determines whether it meets the necessary requirements.
The fourth program takes in two integers and outputs the sum, but outputs double the sum if the two integers are the same.
The fifth program determines whether or not a non-negative number is a multiple of 3 or 5.
The sixth program takes in a string and outputs it with "not" added to the beginning, but outputs the original string if it already has "not" at the beginning.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class DecisionMaking //creates a new class called DecisionMaking
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public DecisionMaking ()  //DecisionMaking class constructor
    {
	c = new Console ("Decision Making"); //creates a new Console object window
    }


    private void title ()  //title method
    {
	c.print (' ', 33);
	c.println ("Decision Making");
	c.println ();
    }


    public void problem1 ()  //problem1 method
    {
	title ();
	//variable declarations
	String sentence;
	char letter;
	int vowels = 0, spaceNum = 0;
	//introduction
	c.println ("Hello! Please input a sentence and this program will output whether or not the  number of vowels exceeds the number of consonants.");
	c.println ();
	//messages to user and user input
	c.print ("Please enter your sentence. ");
	sentence = c.readLine ();
	c.println ();
	//for loop
	for (int i = 0 ; i < sentence.length () ; i++)
	{
	    letter = sentence.charAt (i); //finds each individual letter of the string
	    //if statement
	    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
	    {
		vowels++; //vowel counter
	    }
	    else if (letter == ' ')
	    {
		spaceNum++; //spaces counter
	    }
	}
	//if statement
	if (vowels > sentence.length () - vowels - spaceNum)
	{
	    //output
	    c.println ("The number of vowels exceeds the number of consonants.");
	}
	else
	{
	    //output
	    c.println ("The number of vowels do not exceed the number of consonants.");
	}
	c.println ();
    }


    public void problem2 ()  //problem2 method
    {
	title ();
	//variable declarations
	String vacation, day;
	//introduction
	c.println ("Hello! This program will output whether or not you should sleep in depending on the day and whether or not you are on vacation.");
	c.println ();
	//messages to user and user input
	c.println ("Are you on vacation? Please answer 'yes' or 'no'.");
	vacation = c.readString ();
	c.println ("What day of the week is it?");
	c.println ("Please answer 'sunday', 'monday', 'tuesday', 'wednesday', 'thursday', 'friday', or 'saturday'.");
	day = c.readString ();
	c.println ();
	//if statement
	if (vacation.equals ("yes") || day.equals ("sunday") || day.equals ("saturday"))
	{
	    //output
	    c.println ("True");
	}
	else
	{
	    //output
	    c.println ("False");
	}
	c.println ();
    }


    public void problem3 ()  //problem3 method
    {
	title ();
	//variable declarations
	int weight = 0, length = 0, width = 0, height = 0;
	//introduction
	c.println ("Hello! This program will determine if your postal package meets the necessary   size and weight requirements.");
	c.println ();
	//messages to user and user input
	c.print ("What is the length of the package in cm? Please round up to the nearest integer.");
	length = c.readInt ();
	c.print ("What is the width of the package in cm? Please round up to the nearest integer. ");
	width = c.readInt ();
	c.print ("What is the height of the package in cm? Please round up to the nearest integer.");
	height = c.readInt ();
	c.print ("What is the weight of the package in kg? Please round up to the nearest integer.");
	weight = c.readInt ();
	c.println ();
	//if statement
	if (length * width * height > 100000)
	{
	    //output
	    c.println ("Your package is too large in size. It exceeds 100,000 cubic centimetres.");
	}
	else
	{
	    //output
	    c.println ("Your package meets the size requirements.");
	}
	c.println ();
	//if statement
	if (weight > 27)
	{
	    //output
	    c.println ("Your package is too heavy. It exceeds 27 kilograms.");
	}
	else
	{
	    //output
	    c.println ("Your package meets the weight requirements.");
	}
	c.println ();
    }


    public void problem4 ()  //problem4 method
    {
	title ();
	//variable declarations
	int num1 = 0, num2 = 0;
	//introduction
	c.println ("Hello! Please input 2 integers and this program will output the sum. If the 2 integers are the same value, it will output double the sum.");
	c.println ();
	//messages to user and user input
	c.print ("Please enter the first integer. ");
	num1 = c.readInt ();
	c.print ("Please enter the second integer. ");
	num2 = c.readInt ();
	c.println ();
	//if statement
	if (num1 == num2)
	{
	    //output
	    c.print (2 * (num1 + num2));
	}
	else
	{
	    //output
	    c.print (num1 + num2);
	}
	c.println ();
    }


    public void problem5 ()  //problem5 method
    {
	title ();
	//variable declarations
	int num = 0;
	//introduction
	c.println ("Hello! Please input an integer and this program will output true or false, depending on whether or not it is a multiple of 3 or 5.");
	c.println ();
	//messages to user and user input
	c.println ("Please enter a non-negative number. ");
	num = c.readInt ();
	c.println ();
	//if statement
	if (num % 3 == 0 || num % 5 == 0)
	{
	    //output
	    c.println ("True");
	}
	else
	{
	    //output
	    c.println ("False");
	}
	c.println ();
    }


    public void problem6 ()  //problem6 method
    {
	title ();
	//variable declarations
	String input;
	//introduction
	c.println ("Hello! Please input a string and this program will output the string with 'not' added to the beginning. If the string already has 'not' at the beginning, it will output the original string.");
	c.println ();
	//messages to user and user input
	c.println ("Please enter a string. ");
	c.println ();
	input = c.readLine ();
	//if statement
	if (input.charAt (0) == 'n' && input.charAt (1) == 'o' && input.charAt (2) == 't')
	{
	    //output
	    c.println (input);
	}
	else
	{
	    //output
	    c.println ("not" + input);
	}
	c.println ();
    }



    public static void main (String[] args)  //main method
    {
	DecisionMaking d = new DecisionMaking (); //creates instance variable of DecisionMaking and constructs a new DecisionMaking object
	d.problem1 (); //executes problem1 method
	d.problem2 (); //executes problem2 method
	d.problem3 (); //executes problem3 method
	d.problem4 (); //executes problem4 method
	d.problem5 (); //executes problem5 method
	d.problem6 (); //executes problem6 method
    }
}


