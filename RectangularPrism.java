/*
 * This is the RectangularPrism class, which extends the Solid superclass. 
 * This program provides attributes for RectangularPrism solids and overrides methods from the Solid superclass.
 * 
 * Course Info:
 * ICS4U0
 * @teacher Ms. Krasteva
 * 
 * @version 19.03.18
 * @author Sophia Nguyen
*/

public class RectangularPrism extends Solid 
{
  /** This is the length field. It stores the length of the rectangular prism. */
  private double length; 
  /** This is the width field. It stores the width of the rectangular prism. */
  private double width; 
  /** This is the height field. It stores the height of the rectangular prism. */
  private double height; 
  
  /*
   * This is the RectangularPrism constructor. It calls the superclass constructor and sets the name of the solid. 
   */
  public RectangularPrism ()
  {
    //calls superclass constructor and passes in "Rectangular Prism" 
    super ("Rectangular Prism");
  }
  /*
   * This is the volume method. It returns the volume of the rectangular prism.  
   */
  public double volume ()
  {
    //returns volume 
    return length*width*height; 
  }
  /*
   * This is the surfaceArea method. It returns the surfaceArea of the rectangular prism.
   */
  public double surfaceArea ()
  {
    //returns surface area 
    return 2*((width*length)+(height*length)+(height*width)); 
  }
  /*
   * This is the perimeter method. It returns the perimeter of the rectangular prism.  
   */
  public double perimeter ()
  {
    //returns perimeter 
    return (length*4)+(width*4)+(height*4);
  }
}