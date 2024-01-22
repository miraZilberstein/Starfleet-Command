package starfleet;

/**
 * Represents a Cylon, a robotic crew member, within the Starfleet.
 */
public class Cylon extends myAbstractCrewMember {
    int modelNumber; // Unique identifier for the Cylon model

    /**
     * Constructs a Cylon with specified details.
     * @param name Name of the Cylon.
     * @param age Age of the Cylon.
     * @param yearsInService Years the Cylon has served in Starfleet.
     * @param modelNumber Model number of the Cylon.
     */
    public Cylon(String name, int age, int yearsInService, int modelNumber) {
        super(age, yearsInService, name); // Initializes the abstract crew member with provided details
        this.modelNumber = modelNumber; // Sets the Cylon's model number
    }

  
    public int getModelNumber() {//Returns the model number of the Cylon.
        return this.modelNumber; 
    }

   
    public String toString() {// Returns a string representation of the Cylon.
        return "Cylon\r\n"
                + "Name=" + name + "\r\n"
                + "yearsInService=" + yearsInService + "\r\n"
                + "age=" + age + "\r\n"
                + "modelNumber=" + modelNumber; 
    }
}
