package starfleet;

import java.util.Set;

/**
 * This interface represents the concept of a spaceship in the Starfleet.
 */
public interface Spaceship {
 
    public String getName(); //Get the name of the spaceship.

    public int getCommissionYear(); //Get the commission year of the spaceship.
    public float getMaximalSpeed(); //Get the maximal speed of the spaceship.
    public int getFirePower(); //Get the firepower of the spaceship.
    public Set<? extends CrewMember> getCrewMember();//Get the crew members of the spaceship.
    public int getAnnualMaintenanceCost();//Get the annual maintenance cost of the spaceship.
}
