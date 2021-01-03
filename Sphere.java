/*
 * This is the Sphere class, which extends the Solid superclass. 
 * This program provides attributes for Sphere solids and overrides methods from the Solid superclass.
 * 
 * Course Info:
 * ICS4U0
 * @teacher Ms. Krasteva
 * 
 * @version 19.03.18
 * @author Sophia Nguyen
*/
public class Sphere extends Solid 
{
  /** This is the radius field. It stores the radius of the sphere. */
  private double radius; 
  
  /*
   * This is the Sphere constructor. It calls the superclass constructor and sets the name of the solid. 
   */
  public Sphere ()
  {
    //calls superclass constructor and passes in "Sphere" 
    super ("Sphere");
  }
  /*
   * This is the volume method. It returns the volume of the sphere.  
   */
  public double volume ()
  {
    //returns volume 
    return (4.0/3)*(Math.PI * Math.pow (radius,3)); 
  }
  /*
   * This is the surfaceArea method. It returns the surfaceArea of the sphere.  
   */
  public double surfaceArea ()
  {
    //returns surfaceArea
    return (4*Math.PI*radius*radius);
  }
  /*
   * This is the perimeter method. It returns the perimeter of the sphere.  
   */
  public double perimeter ()
  {
    //returns 0 (spheres do not have perimeters)
    return 0.0;
  }
}