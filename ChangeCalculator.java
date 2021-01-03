/**
Sophia and Alyssa
Ms. Krasteva
Sept. 18, 2018
This program tells you how much change the store clerk needs to give and how to give it using the minimum number of coins and bills.*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class ChangeCalculator //creates a new class called ChangeCalculator
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public ChangeCalculator ()  //ChangeCalculator class constructor
    {
	c = new Console (); //creates a new Console object window
    }


    public void drawTitle ()  //drawTitle method
    {
	c.print (' ', 29);
	c.println ("Change Making Program");
	c.println ();
    }


    public void inputOutput ()  //inputOutput method
    {
	double totalPurchase, amountTendered, change;
	c.println ("Please enter the total purchase:");
	totalPurchase = c.readDouble ();
	c.println ("Please enter the amount tendered:");
	amountTendered = c.readDouble ();
	change = amountTendered - totalPurchase;
	c.println ("The change will be:");
	c.print ("$");
	c.println (change, 0, 2);
	double tenDollarBills1, tenDollarBills2, fiveDollarBills1, fiveDollarBills2, toonies1, toonies2, loonies1, loonies2, quarters1, quarters2, nickels1, nickels2, dimes1, dimes2, pennies1, pennies2;
	tenDollarBills1 = change / 10;
	tenDollarBills2 = (int) tenDollarBills1;
	fiveDollarBills1 = (change - (10 * tenDollarBills1)) / 5;
	fiveDollarBills2 = (int) fiveDollarBills1;
	toonies1 = (change - (10 * tenDollarBills2 + 5 * fiveDollarBills2) / 2);
	toonies2 = (int) toonies1;
	loonies1 = (change - (10 * tenDollarBills2 + 5 * fiveDollarBills2 + 2 * toonies2));
	loonies2 = (int) loonies1;
	quarters1 = (change - (10 * tenDollarBills2 + 5 * fiveDollarBills2 + 2 * toonies2 + loonies2) / 0.25);
	quarters2 = (int) quarters1;
	dimes1 = (change - (10 * tenDollarBills2 + 5 * fiveDollarBills2 + 2 * toonies2 + loonies2 + 0.25 * quarters2) / 0.1);
	dimes2 = (int) dimes1;
	nickels1 = (change - (10 * tenDollarBills2 + 5 * fiveDollarBills2 + 2 * toonies2 + loonies2 + 0.25 * quarters2 + 0.1 * dimes2) / 0.05);
	nickels2 = (int) nickels1;
	pennies1 = (change - (10 * tenDollarBills2 + 5 * fiveDollarBills2 + 2 * toonies2 + loonies2 + 0.25 * quarters2 + 0.1 * dimes2 + 0.05 * nickels2) / 0.01);
	pennies2 = (int) pennies1;
	c.println ("To make up this amount you will need:");
	c.println (tenDollarBills2 + " ten-dollar bill(s)");
	c.println (toonies2 + " toonie(s)");
	c.println (loonies2 + " loonie(s)");
	c.println (quarters2 + " quarter(s)");
	c.println (nickels2 + " nickel(s)");
	c.println (pennies2 + " penn(y)(ies)");
	c.print ("Thank you for using the Change Making Program");
    }


    public static void main (String[] args)  //main method
    {
	ChangeCalculator c = new ChangeCalculator (); //creates instance variable of ChangeCalculator and constructs a new ChangeCalculator object
	c.drawTitle (); //executes drawTitle method
	c.inputOutput (); //executes inputOutput method
    }
}

