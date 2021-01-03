/**
Sophia Nguyen
Ms. Krasteva
Dec. 3, 2018
This program will get ten strings and output all of them in two lists (depending on the first letter of the string) with two letters at the beginning of each string.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class SecretCode2 //creates a new class called SecretCode2
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public SecretCode2 ()  //SecretCode2 class constructor
    {
	c = new Console ("Secret Code 2"); //creates a new Console object window
    }


    public void display ()  //display method
    {
	//string array declarations
	String[] phraseArray = new String [10];
	String[] phraseArray2 = new String [10];
	//variable declarations
	String phrase;
	int counter = 0, counter2 = 0;
	//user prompt
	c.println ("Please enter 10 words/phrases/sentences and press the enter key after each one: ");
	c.println ();
	//loop runs through each element of the array
	for (int i = 0 ; i < 10 ; i++)
	{
	    //gets phrase
	    phrase = c.readLine ();
	    //if the phrase starts with a letter between A to O
	    if ((phrase.charAt (0) >= 65 && phrase.charAt (0) <= 79) || (phrase.charAt (0) >= 97 && phrase.charAt (0) <= 111))
	    {
		//counter increases by 1
		counter++;
		//stores phrase inside first available element in phraseArray
		phraseArray [counter - 1] = phrase;
	    }
	    //if the phrase starts with a letter between P to Z
	    else if ((phrase.charAt (0) >= 80 && phrase.charAt (0) <= 90) || (phrase.charAt (0) >= 112 && phrase.charAt (0) <= 122))
	    {
		//counter2 increases by 1
		counter2++;
		//stores phrase inside first available element in phraseArray2
		phraseArray2 [counter2 - 1] = phrase;
	    }
	}
	//new array declarations
	String[] newPhraseArray = new String [counter];
	String[] newPhraseArray2 = new String [counter2];
	//loop runs through first element of array to the last element with a value (not null)
	for (int i = 0 ; i < newPhraseArray.length ; i++)
	{
	    //transfers each element with a value to the new array
	    newPhraseArray [i] = phraseArray [i];
	}
	//loop runs through first element of array to the last element with a value (not null)
	for (int i = 0 ; i < newPhraseArray2.length ; i++)
	{
	    //transfers each element with a value to the new array
	    newPhraseArray2 [i] = phraseArray2 [i];
	}
	//spacing
	c.println ();
	c.println ("List 1 (A to O)");
	//loop runs through each element of the array
	for (int i = 0 ; i < newPhraseArray.length ; i++)
	{
	    //displays each phrase with "hi" at the beginning
	    c.println ("hi" + newPhraseArray [i]);
	}
	c.println ();
	c.println ("List 2 (P to Z)");
	//loop runs through each element of the array
	for (int i = 0 ; i < newPhraseArray2.length ; i++)
	{
	    //displays each phrase with "hi" at the beginning
	    c.println ("hi" + newPhraseArray2 [i]);
	}
    }


    public static void main (String[] args)  //main method
    {
	SecretCode2 s = new SecretCode2 (); //creates instance variable of SecretCode2 and constructs a new SecretCode2 object
	s.display (); //executes display method
    }
}
