package starfleet;

/**
 * Represents an Officer in the Starfleet, extending CrewWoman with an additional rank attribute.
 */
public class Officer extends CrewWoman {
    OfficerRank rank; // Rank of the officer

    // Constructor initializing Officer with name, age, years in service, and rank
    public Officer(String name, int age, int yearsInService, OfficerRank rank) {
        super(age, yearsInService, name); 
        this.rank = rank; 
    }

    // Getter for rank
    public OfficerRank getRank() {
        return this.rank;
    }

    // String representation of Officer
    public String toString() {
        return "Officer\r\n"
                + " Name=" + name + "\r\n"
                + " yearsInService=" + yearsInService + "\r\n"
                + " age=" + age + "\r\n"
                + " rank=" + rank; // Includes rank in the description
    }
}
