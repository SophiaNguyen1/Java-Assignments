/*
 * This is the PersonRecord class, which implements the PersonalInfo interface.
 * This class provides fields for the personal record's information and implements methods of the PersonalInfo interface. 
 * 
 * Course Info:
 * ICS4U0
 * @teacher Ms. Krasteva
 * 
 * @version 19.03.18
 * @author Sophia Nguyen
*/

import java.util.*; //imports java utility package 

public class PersonRecord implements PersonalInfo
{
  /** This is the creationDate field. It stores the Calendar date that the record was created. */
  private Calendar creationDate;
  /** This is the currentAge field. It stores the person's current age based on their birth year. */
  private int currentAge; 
  
  /*
   * This is the PersonRecord default constructor. It allocates memory for a PersonRecord object.  
   */ 
  public PersonRecord ()
  {
    //initializes fields 
    creationDate = null; 
    currentAge = 0;
  }
  
  /*
   * This is the getFileCreationDate method. It returns the date that the record was created. 
   */
  public Calendar getFileCreationDate()
  {
    //creates a Calendar object and stores the creation date in it 
    Calendar c = Calendar.getInstance();
    //returns the Calendar object 
    return c; 
  }
  /*
   * This is the getCurrentAge method. It returns the person's age based on their birth year. 
   * @param birthYear Stores the year that the person was born. 
   */
  public int getCurrentAge (int birthYear)
  {
    //currentYear local integer variable 
    int currentYear = 2019;  //sets currentYear to 2019
    //returns the age 
    return currentYear - birthYear;  
  }

}