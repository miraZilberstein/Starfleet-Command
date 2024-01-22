package starfleet;

/**
 * Represents a female crew member within the Starfleet.
 */
public class CrewWoman extends myAbstractCrewMember {

    /**
     * Constructs a CrewWoman with specified details.
     * @param age Age of the crew woman.
     * @param yearsInService Years the crew woman has served in Starfleet.
     * @param name Name of the crew woman.
     */
    public CrewWoman(int age, int yearsInService, String name){
        super(age, yearsInService, name); // Initializes the abstract crew member with provided details
    }

    public String toString() {//Returns a string representation of the CrewWoman.
        return "CrewWoman\r\n"
                + " Name=" + name + "\r\n"
                + " yearsInService=" + yearsInService + "\r\n"
                + " age=" + age + "\r\n"; 
    }
}
