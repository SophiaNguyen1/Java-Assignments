/*
 * This is the PersonalInfo interface.
 * This interface defines methods that must be coded by programs which implement this interface.
 * 
 * Course Info:
 * ICS4U0
 * @teacher Ms. Krasteva
 * 
 * @version 19.03.18
 * @author Sophia Nguyen
*/

import java.util.*; //imports java utility package 

public interface PersonalInfo 
{
  /*
   * This is the definition of the getFileCreationDate method. 
   */
  Calendar getFileCreationDate(); //returns creation date of record 
  /*
   * This is the definition of the currentAge method. 
   */
  int getCurrentAge (int birthYear); //calculates and returns age of person based on current computer date 
}