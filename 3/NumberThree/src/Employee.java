/**
 * It holds the employee information
 *
 * @author Erfan
 * @version 1
 */
public class Employee {

    // Fields //

    // The first name of employee
    public String firstName ;

    // The last name of employee
    public String lastName ;

    // The age of employee
    private int age ;

    // The number of children of employee
    private int numOfChildren ;

    // the first name of the employee spouse
    public String firstNameOfSpouse ;

    // the last name of the employee spouse
    public String lastNameOfSpouse ;

    // Constructor //

    /**
     * Create a new employee with given first name and last name and age
     * *
     * @param fName the first name of employee
     * @param lName the last name of employee
     * @param agee the age of employee
     */
    public Employee ( String fName ,  String lName , int agee ){
        firstName = fName ;
        lastName = lName ;
        age = agee ;
    }

    /**
     * Create a new employee with given first name and last name and age and first Name Of Spouse and last Name Of Spouse
     * *
     * @param fName the first name of employee
     * @param lName the last name of employee
     * @param agee the age of employee
     * @param fNameOfSpouse the first name of employee spouse
     * @param lNameOfSpouse the last name of employee spouse
     */
    public Employee ( String fName ,  String lName , int agee , String fNameOfSpouse , String lNameOfSpouse){
        firstName = fName ;
        lastName = lName ;
        age = agee ;
        firstNameOfSpouse = fNameOfSpouse ;
        lastNameOfSpouse = lNameOfSpouse ;
    }

    // Method //

    /**
     * Increase one unit the number of employee child
     */
    public void addChild (){
        numOfChildren++ ;
    }

}
