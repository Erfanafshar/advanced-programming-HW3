/**
 * The Main class for make objects and continue program to the goal
 *
 * @author Erfan
 * @version 1
 */
public class Main {

    // Method //

    /**
     * The main method
     *
     * @param args the input parameters of main method
     */
    public static void main(String[] args) {

        // Create a car tag object
        CarTag ct1 = new CarTag("9631007" , "Erfan" , "Afshar" ) ;

        // Add fines
        ct1.addFines("SpeedLimit");
        ct1.addFines("OverTaking");
        ct1.addFines("BadPark") ;
        ct1.addFines("NoEntry");
        ct1.addFines("LampFailure");

        // Check validity of plate
        System.out.println("validity of plate is : " + ct1.licensePlate);

        // Remove fines
        ct1.removeFines("BadPark");

        // Check validity of plate
        System.out.println("validity of plate is : " + ct1.licensePlate);

    }
}
