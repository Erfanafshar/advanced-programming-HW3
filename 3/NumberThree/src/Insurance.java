/**
 * It holds the insurance company information
 * *
 * @author Erfan
 * @version 1
 */
public class Insurance {

    // Field //

    // The name of the company
    private String name ;

    // Constuctor //

    /**
     * Create a new Insurance object with given name of company
     *
     * @param nme the name of the Insurance company
     */
    public Insurance (String nme){
        name = nme ;
    }

    // Method //

    /**
     * Register the employee in a Insurance company
     *
     * @param karmand an Employee object with details
     */
    public void register ( Employee karmand ){
        if ( karmand.firstName == karmand.firstNameOfSpouse && karmand.lastName == karmand.lastNameOfSpouse ){
            System.out.println("Insurance record for employee " + karmand.firstName + " " + karmand.lastName  + " cannot be registered!");
        }
        else {
            System.out.println("An insurance record for employee " + karmand.firstName  + " " + karmand.lastName + " successfully registered by company " + name );
        }

    }

}
