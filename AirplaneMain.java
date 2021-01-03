public class AirplaneMain
{
  public static void main (String [] args)
  {
    Airplane plane1 = new Airplane ();
    plane1.loadPass (50);
    plane1.closeDoor ();
    plane1.getDoorStatus ();
    plane1.getPassengers ();
    plane1.takeOff ();
    plane1.doneTakeOff ();
    plane1.getLandingGear ();
    plane1.normalFlight (30);
    plane1.prepLanding ();
    plane1.getLandingGear ();
    plane1.land ();
    plane1.openDoor ();
    plane1.getDoorStatus ();
    plane1.unloadPass ();
    plane1.getGasLevel ();
    plane1.fillUp ();
  }
}