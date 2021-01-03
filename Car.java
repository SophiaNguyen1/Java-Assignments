public class Car //Car class
{
    //global instance variables
    private String brand; //brand name
    private String model; //model name
    private int kilometres; //kilometres driven
    private double gas; //gas in tank
    private double tankCapacity; //tank capacity

    /*
     * This method is the class constructor. It allocates memory for the Car object. 
     * It takes in arguments for the brand, model, gas, and tank capacity, and sets values for the instance variables.
     */
    public Car (String b, String m, double g, double tCap)  //brand, model, gas, and tankCapacity arguments 
    {
        brand = b; //sets brand to b 
        model = m; //sets model to m
        kilometres = 0; //sets kilometres to 0
        gas = g; //sets gas to g
        tankCapacity = tCap; //sets tankCapacity to tCap 
    }


    /*
     * This method is the drive method. It takes in a distance argument and 'drives' the car.
     * The kilometres increases by the distance and the gas decreases by the distance divided by 5.
     */
    public void drive (double distance) //distance parameter 
    {
        kilometres += distance; //kilometres increases by distance number
        gas -= distance / 5; //gas decreases by distance divided by 5 
    }


    /*
     * This method is the gasUp method. It refills the gas to the full tank capacity. 
     */
    public void gasUp ()
    {
       gas = tankCapacity; //refills gas in tank to full capacity
    }
    
    /*
     * This method is the main method. It creates new Car objects and calls the instance methods. 
     */
    public static void main (String [] args)
    {
      //creates 5 new car objects and passes in arguments for the brand, model, gas amount, and tank capacity 
      Car c1 = new Car ("Toyota", "Highlander", 40.5, 72.5); //creates the first Car object named c1
      Car c2 = new Car ("Hyundai", "Elantra", 50.5, 80.5); //creates the second Car object named c2
      //calls drive method and passes in distance arguments 
      c1.drive (20); //calls drive for c1 and passes in 20 for the distance argument 
      c2.drive (10); //calls drive for c2 and passes in 10 for the distance argument 
      //calls gasUp method 
      c1.gasUp (); //calls gasUp for c1
      c2.gasUp (); //calls gasUp for c2
    }
}
