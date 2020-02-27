// Add packages
import java.util.ArrayList ;
import java.util.Iterator ;

/**
 * This class contains a car plate information
 * As the number of plate and the name of the holder
 * *
 * @author Erfan
 * @version 1
 */
public class CarTag {

    // Field //

    // The number of plate
    private String numberPlates ;

    // The licence of plate
    public boolean licensePlate ;

    // The first name of plate holder
    private String firstNamePlaqueHolder ;

    // The last name of plate holder
    private String lastNamePlaqueHolder ;

    // The list of plate fines
    public ArrayList <String> fines  ;


    // Constructor //

    /**
     * Create a plate with given plate number and the name of holder
     *
     * @param numberPlate The number of plate
     * @param fNamePlaqueHolder The first name of plate holder
     * @param lNamePlaqueHolder The last name of plate holder
     */
    public CarTag ( String numberPlate , String fNamePlaqueHolder , String lNamePlaqueHolder ){
        numberPlates = numberPlate ;
        firstNamePlaqueHolder = fNamePlaqueHolder ;
        lastNamePlaqueHolder = lNamePlaqueHolder ;
        licensePlate = true ;
        fines = new ArrayList<String>() ;
    }

    // Method //

    /**
     * Print all fines of the plate
     */
    void printAllFines (){
        Iterator<String> it = fines.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next()) ;
        }
    }

    /**
     * Add fines to the plate and check the validity of plate
     * @param finesName The name of the fines
     */
    public void addFines (String finesName){
        fines.add(finesName);
        if (fines.size() >= 10 ){
            licensePlate = false ;
        }
    }

    /**
     * Remove fines to the plate and check the validity of plate
     * @param finesName The name of the fines
     */
    public void removeFines (String finesName){
        fines.remove(finesName);
        if (fines.size() < 5 ){
            licensePlate = true ;
        }
    }

}