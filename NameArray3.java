/**
Sophia Nguyen
Ms. Krasteva
Dec. 3, 2018
This program will run 5 different programs: amtDiff, threeOfKind, notDifferent, and wellBalanced.
The first program (amtDiff) will display the difference between the highest and lowest mark from a set of student marks.
The second program (thirdInPair) will display true or false depending on whether every pair of consecutive numbers in an array contains a certain number.
The third program (threeOfKind) will display true or false depending on if the array contains three consecutive increasing numbers.
The fourth program (notDifferent) will display a new array where each isolated element in the original array is replaced with the greater value to its left or right.
The fifth program (wellBalanced) will display true or false depending on whether the array can be split up so that the sum on one side is equal to the sum on the other side.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.*; //gives access to the Console class file

public class NameArray3 //creates a new class called NameArray3
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public NameArray3 ()  //NameArray3 class constructor
    {
	c = new Console ("Name Array 3"); //creates a new Console object window
    }


    public void mainMenu ()  //mainMenu method
    {
	//variable declaration
	String choice;
	//main menu choices
	c.println ("Main Menu");
	c.println ();
	c.println ("1. amtDiff");
	c.println ("2. thirdInPair");
	c.println ("3. threeOfKind");
	c.println ("4. notDifferent");
	c.println ("5. wellBalanced");
	//loop
	while (true)
	{
	    c.setCursor (9, 1);
	    //user prompt
	    c.println ("Please enter 1, 2, 3, 4, or 5: ");
	    c.println ();
	    c.setCursor (9, 32);
	    //gets input
	    choice = c.readString ();
	    //if input is invalid
	    if (!(choice.equals ("1") || choice.equals ("2") || choice.equals ("3") || choice.equals ("4") || choice.equals ("5")))
	    {
		//error message
		new Message ("You must enter 1, 2, 3, 4, or 5.");
	    }
	    //if input is valid
	    else
	    {
		break; //exits the loop
	    }
	}
	//amtDiff
	if (choice.equals ("1"))
	{
	    int[] marks = {100, 30, 50, 60};
	    c.print (amtDiff (marks));
	}
	//thirdInPair
	else if (choice.equals ("2"))
	{
	    int[] set = {1, 2, 1, 3};
	    c.print (thirdInPair (set, 1));
	}
	//threeOfKind
	else if (choice.equals ("3"))
	{
	    int[] numberArray = {3, 3, 1, 4, 5, 6, 2};
	    c.print (threeOfKind (numberArray));
	}
	//notDifferent
	else if (choice.equals ("4"))
	{
	    int[] b = {1, 2, 3};
	    notDifferent (b, 2);
	}
	//wellBalanced
	else if (choice.equals ("5"))
	{
	    int[] set = {1, 1, 1, 2, 1};
	    c.print (wellBalanced (set));
	}
    }


    private int amtDiff (int[] marks)  //amtDiff method
    {
	//variable declarations
	int lowestMark = 100, highestMark = 0;
	//loop runs through marks array
	for (int i = 0 ; i < marks.length ; i++)
	{
	    //if number is less than the lowest mark
	    if (marks [i] < lowestMark)
	    {
		//sets the lowest mark to the number
		lowestMark = marks [i];
	    }
	    //if number is greater than the highest mark
	    if (marks [i] > highestMark)
	    {
		//sets the highest mark to the number
		highestMark = marks [i];
	    }
	}
	//returns the difference of the highest and lowest mark
	return (highestMark - lowestMark);
    }


    private boolean thirdInPair (int[] set, int num)  //thirdInPair method
    {
	//variable declaration
	boolean value = true;
	//loop runs through first element of the array to the 2nd last
	for (int i = 0 ; i < set.length - 1 ; i++)
	{
	    //if the element and the element after is not equal to the number
	    if (set [i] != num && set [i + 1] != num)
	    {
		//sets the value to false
		value = false;
	    }
	}
	//returns value
	return value;
    }



    private boolean threeOfKind (int[] numberArray)   //threeOfKind method
    {
	//variable declarations
	int num1 = 0, num2 = 0, num3 = 0;
	boolean trueOrFalse = false;
	//loop runs through the second element of the array to the second last
	for (int i = 1 ; i < numberArray.length - 1 ; i++)
	{
	    //stores the number before the number in num1
	    num1 = numberArray [i - 1];
	    //stores the number in num2
	    num2 = numberArray [i];
	    //stores the number after the number in num3
	    num3 = numberArray [i + 1];
	    //if all 3 of the numbers are the same
	    if ((num1 == num2 - 1) && (num3 == num2 + 1))
	    {
		//sets trueOrFalse to true
		trueOrFalse = true;
	    }
	}
	//returns trueOrFalse
	return trueOrFalse;
    }


    private int[] notDifferent (int[] set1, int num)  //notDifferent method
    {
	//creates new array
	int[] array = new int [set1.length];
	//loop runs through each element of the array
	for (int i = 0 ; i < array.length ; i++)
	{
	    //stores each element of the array into the new array
	    array [i] = set1 [i];
	}
	//loop runs through the second element of the array to the second last
	for (int i = 1 ; i < array.length - 1 ; i++)
	{
	    //if the element of the array is equal to the number
	    if (array [i] == num)
	    {
		//if neither number to the left and right is the same as the number, and if the number on the right is greater
		if (array [i - 1] < array [i + 1] && array [i - 1] != array [i] && array [i + 1] != array [i])
		{
		    //replaces number with the same number as the number on the right
		    array [i] = array [i + 1];
		}
		//if neither number to the left and right is the same as the number, and if the number on the left is greater
		else if (array [i - 1] >= array [i + 1] && array [i - 1] != array [i] && array [i + 1] != array [i])
		{
		    //replaces number with the same number as the number on the left
		    array [i] = array [i - 1];
		}
	    }
	}
	//returns the altered array
	return array;
    }


    private boolean wellBalanced (int[] set1)  //wellBalanced method
    {
	//variable declarations
	boolean trueOrFalse = false;
	int total = 0, firstPartTotal = 0;
	//loop runs through each element of the array
	for (int i = 0 ; i < set1.length ; i++)
	{
	    //adds up the total of all of the numbers in the array
	    total += set1 [i];
	}
	//loop runs through each element of the array
	for (int i = 0 ; i < set1.length ; i++)
	{
	    //adds up the total of the first part of the split
	    firstPartTotal += set1 [i];
	    //if the total of the first part of the split is equal to the second part of the split
	    if (firstPartTotal == total - firstPartTotal)
	    {
		//sets trueOrFalse to true
		trueOrFalse = true;
	    }
	}
	//returns trueOrFalse
	return trueOrFalse;
    }


    public static void main (String[] args)  //main method
    {
	NameArray3 n = new NameArray3 (); //creates instance variable of NameArray3 and constructs a new NameArray3 object
	n.mainMenu (); //executes mainMenu method
    }
}


