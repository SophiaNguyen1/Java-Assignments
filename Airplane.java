/**
* This is the Airplane class. 
* This program provides attributes and methods for airplane objects. 
*
* Course Info:
* ICS4U0 
* @teacher Ms. Krasteva
* 
* @version 19.02.15 
* @author Sophia Nguyen 
*/
public class Airplane
{
  /** This is the gasLevel field. It stores the current level of gas in the airplane (out of 100). */
  private int gasLevel; 
  /** This is the landingGear field. It stores the current state of the landing gear (up or down). */
  private String landingGear; 
  /** This is the doorStatus field. It stores the current state of the door (open or closed). */
  private String doorStatus; 
  /** This is the passengers field. It stores the current number of passengers in the airplane. */
  private int passengers; 
  
  /**
   * This is the Airplane class constructor. It allocates memory in RAM for the Airplane object. It also sets default values for the fields. 
   */
  public Airplane ()
  {
    gasLevel = 100; //sets gasLevel to 100
    landingGear = "Down."; //sets landingGear to 'down'
    doorStatus = "Open."; //sets doorStatus to 'open'
    passengers = 100; //sets passengers to 100 
  }
  
  /**
   * This is the openDoor method. It sets the door status to 'open'. 
   */
  public void openDoor ()
  {
    doorStatus = "Open."; //sets door status to 'open'
  }
  
  /**
   * This is the closeDoor method. It sets the door status to 'closed'.
   */
  public void closeDoor ()
  {
    doorStatus = "Closed."; //sets doorStatus to 'closed'
  }
  
  /**
   * This is the fillUp method. It sets the gas level back to its full capacity (100).
   */
  public void fillUp ()
  {
    gasLevel = 100; //sets gasLevel to 100 
  }
  
  /**
   * This is the takeOff method. It uses (subtracts) 30 of the gas from the gas level. 
   */
  public void takeOff ()
  {
    gasLevel -= 30; //subtracts 30 from gasLevel
  }
  
  /**
   * This is the doneTakeOff method. It sets the landingGear to 'up'. 
   */
  public void doneTakeOff ()
  {
    landingGear = "Up."; //sets landingGear to 'up'
  }
  
  /**
   * This is the normalFlight method. It subtracts a number (percentage of the gas used in normal flight) from the airplane's gas level.
   * @param num An integer that stores the percentage of gas used in normal flight. 
   */
  public void normalFlight (int num)
  {
    gasLevel -= num; //subtracts gas level by gas consumption number
  }
  
  /**
   * This is the prepLanding method. It sets the landingGear to 'down'.
   */
  public void prepLanding ()
  {
    landingGear = "Down."; //sets landingGear to 'down'
  }
  
  /**
   * This is the land method. It uses (subtracts) 15 from the gas level of the airplane.
   */
  public void land ()
  {
    gasLevel -= 15; //subtracts gas level by 15
  }
  
  /**
   * This is the loadPass method. It adds a number of new passengers to the current number of passengers on the plane.
   * @param passengersLoaded An integer that stores the number of people boarding the plane. 
   */
  public void loadPass (int passengersLoaded)
  {
    passengers += passengersLoaded; //adds number of new passengers to passengers
  }
  
  /**
   * This is the unloadPass method. It sets the passengers number to 0. 
   */
  public void unloadPass ()
  {
    passengers = 0; //sets passengers to 0 
  }
  
  /**
   * This is the gasLevel method. It returns the gas level of the airplane.
   * @return An integer representing the gas level of the plane. 
   */
  public int getGasLevel ()
  { 
    return gasLevel; //returns gasLevel
  }
  
  /**
   * This is the getDoorStatus method. It returns the door status. 
   * @return A string representing the door status (open or closed).
   */
  public String getDoorStatus ()
  {
    return doorStatus; //returns doorStatus 
  }
  
  /**
   * This is the getPassengers method. It returns the number of passengers on the plane. 
   * @return An integer representing the number of passengers on the plane. 
   */
  public int getPassengers ()
  {
    return passengers; //returns passengers
  }
  
  /**
   * This is the getLandingGear method. It returns the landing gear state.
   * @return A string representing the landing gear state (up or down).
   */
  public String getLandingGear ()
  {
    return landingGear; //returns landingGear
  }
  
}