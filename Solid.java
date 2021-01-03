/*
 * This is the abstract Solid class.
 * This program provides attributes and methods for a Solid object (including defining abstract methods).
 * 
 * Course Info:
 * ICS4U0
 * @teacher Ms. Krasteva
 * 
 * @version 19.03.18
 * @author Sophia Nguyen
*/

public abstract class Solid 
{
  /** This is the name field. It stores the name of the solid. */
  private String name; 
  
  /*
   * This is the Solid constructor. It allocates memory for Solid objects.  
   * @param name Stores the name of the solid. 
   */
  public Solid (String name)
  {
    //sets name field to name parameter 
    this.name = name; 
  } 
  
  /*
   * This is the getName method. It outputs the name of the solid.  
   */
  public void getName()
  {
    //prints the name of the solid 
    System.out.println ("The solid name is " + name + "."); 
  }
  
  /*
   * This is the definition of the abstract volume method. It returns the volume of the solid.  
   */
  public abstract double volume();
  /*
   * This is the definition of the abstract perimeter method. It returns the perimeter of the solid.  
   */
  public abstract double perimeter();
  /*
   * This is the definition of the abstract surfaceArea method. It returns the surface area of the solid.  
   */
  public abstract double surfaceArea();
}