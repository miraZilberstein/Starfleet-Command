package starfleet;

import java.util.Objects;
import java.util.Set;

public abstract class myAbstractSpaceShip implements Spaceship {
    String name; // Name of the spaceship
    int commissionYear; // Year the spaceship was commissioned
    float maximalSpeed; // Maximal operational speed
    Set<? extends CrewMember> crewMembers; // Crew members on board

    // Constructor initializes the spaceship with given attributes
    public myAbstractSpaceShip(String name, int commissionYear, float maximalSpeed, Set<? extends CrewMember> crewMembers) {
        this.name = name;
        this.commissionYear = commissionYear;
        this.maximalSpeed = maximalSpeed;
        this.crewMembers = crewMembers;
    }

    
    public String getName() { return this.name; }// Returns the spaceship name
    public int getCommissionYear() { return this.commissionYear; }// Returns the year the spaceship was commissioned
    public float getMaximalSpeed() { return this.maximalSpeed; }// Returns the maximal speed of the spaceship
    public Set<? extends CrewMember> getCrewMember() { return this.crewMembers; }// Returns the crew members aboard the spaceship


    // Overrides hashCode using spaceship's name
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // Overrides equals to compare spaceship objects based on name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        myAbstractSpaceShip other = (myAbstractSpaceShip) obj;
        return Objects.equals(name, other.name);
    }
}
