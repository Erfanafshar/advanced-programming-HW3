public class Main {

    // Method //

    /**
     * The main method for creating objects and continue the program
     *
     * @param args the String in input of the method
     */
    public static void main(String[] args) {

        // Create 3 employee object
        Employee emp1 = new Employee( "Hamid" , "Vahidi" , 25 , "Neda" , "Omidi");
        Employee emp2 = new Employee( "Omid" , "Sharifi" , 29 , "Zahra" , "Hamidi");
        Employee emp3 = new Employee( "Ali" , "Rezaei" , 35 , "Ali" , "Rezaei");

        // Create 2 Insurance object with names Sina and Iran
        Insurance ins1 = new Insurance("Sina");
        Insurance ins2 = new Insurance("Iran");

        // Register the employers in Sina Insurance company
        ins1.register(emp1);
        ins1.register(emp2);
        ins1.register(emp3);

        // Register the employers in Iran Insurance company
        ins2.register(emp1);
        ins2.register(emp2);
        ins2.register(emp3);

    }

}
