/**
Sophia Nguyen
Ms. Krasteva
Sept. 13, 2018
This assignment displays the gross monthly salary information of employees at the Acme Chemical Company.
*/

import java.awt.*; //gives access to the java command libraries
import hsa.Console; //gives access to the Console class file

public class AcmeSalaries //creates a new class called AcmeSalaries
{
    Console c; //creates an instance variable of Console class so the output window can be made
    public AcmeSalaries ()  //AcmeSalaries class constructor
    {
	c = new Console ("Acme Employee Salaries"); //creates a new Console object window and names it
    }


    public void drawTitle ()  //drawTitle method
    {
	c.print (' ', 30);
	c.println ("Acme Chemical Company");
	c.println ();
	c.print (' ', 2);
	c.print ("Employee");
	c.print (' ', 8);
	c.print ("Hourly Rate");
	c.print (' ', 4);
	c.print ("Total Hours Per Week");
	c.print (' ', 6);
	c.println ("Gross Monthly Salary");
	c.println ();
    }


    public void displaySalary ()  //displaySalary method
    {
	int hoursWorked1, hoursWorked2, hoursWorked3, hourlyRate3; //integer variable declarations
	double hourlyRate1, hourlyRate2, monthlySalary1, monthlySalary2, monthlySalary3; //double variable declarations
	hoursWorked1 = 2; //variable assignment
	hoursWorked2 = 40; //variable assignment
	hoursWorked3 = 15; //variable assignment
	hourlyRate1 = 59.5; //variable assignment
	hourlyRate2 = 4.25; //variable assignment
	hourlyRate3 = 92; //variable assignment
	monthlySalary1 = hoursWorked1 * hourlyRate1; //salary 1 calculations
	monthlySalary2 = hoursWorked2 * hourlyRate2; //salary 2 calculations
	monthlySalary3 = hoursWorked3 * hourlyRate3; //salary 3 calculations
	c.print (' ', 2);
	c.print ("Superman");
	c.print (' ', 10);
	c.print ("$");
	c.print (hourlyRate1, 0, 2);
	c.print (hoursWorked1, 17);
	c.print (' ', 25);
	c.print ("$");
	c.println (monthlySalary1, 0, 2);
	c.print (' ', 2);
	c.print ("Coyote");
	c.print (' ', 12);
	c.print ("$");
	c.print (hourlyRate2, 0, 2);
	c.print (hoursWorked2, 19);
	c.print (' ', 24);
	c.print ("$");
	c.println (monthlySalary2, 0, 2);
	c.print (' ', 2);
	c.print ("Road Runner");
	c.print (' ', 7);
	c.print ("$");
	c.print (hourlyRate3, 0, 2);
	c.print (hoursWorked3, 18);
	c.print (' ', 24);
	c.print ("$");
	c.println (monthlySalary3, 0, 2);

    }


    public static void main (String[] args)  //main method
    {
	AcmeSalaries a = new AcmeSalaries (); //creates instance variable of AcmeSalaries and constructs a new AcmeSalaries object
	a.drawTitle (); //executes drawTitle method
	a.displaySalary (); //executes displaySalary method
    }
}
