package starfleet;

import java.util.List;
import java.util.Set;

/**
 * The ColonialViper class represents a specific type of battleship in the starfleet,
 * extending the capabilities of a generic myBattleShip. This ship is known for its
 * agility and combat effectiveness, particularly in close-range battles.
 */
public class ColonialViper extends myBattleShip {

    /**
     * Constructs a new ColonialViper ship with specified parameters.
     *
     * @param name The name of the ship.
     * @param commissionYear The year the ship was commissioned into the fleet.
     * @param maximalSpeed The maximum speed of the ship.
     * @param crewMembers A set of CrewWoman indicating the crew aboard the ship.
     * @param weapons A list of Weapon objects indicating the ship's armament.
     */
    public ColonialViper(String name, int commissionYear, float maximalSpeed, Set<CrewWoman> crewMembers,
                         List<Weapon> weapons) {
        super(name, commissionYear, maximalSpeed, crewMembers, weapons); // Calls the constructor of the superclass (myBattleShip)
        int annualMaintenance = 4000; // Base annual maintenance cost
        // Adds the maintenance cost of each weapon to the annual maintenance
        for (Weapon w : super.weapons)
            annualMaintenance += w.getAnnualMaintenanceCost();
        // Adds a fixed maintenance cost for each crew member
        for (CrewMember c : super.crewMembers)
            annualMaintenance += 500;
        // Adds additional maintenance cost based on the ship's speed
        annualMaintenance += Math.round(500 * maximalSpeed);
        super.setAnnualMaintenanceCost(annualMaintenance); // Updates the annual maintenance cost
    }

    //Provides a string representation of the ColonialViper ship, including all relevant details.
    public String toString() {
        return "ColonialViper\r\n"
                + " name=" + name + "\r\n"
                + " commissionYear=" + commissionYear + "\r\n"
                + " maximalSpeed=" + maximalSpeed + "\r\n"
                + " firepower=" + firePower + "\r\n"
                + " crewMembers=" + crewMembers.size() + "\r\n"
                + " annualMaintenanceCost=" + annualMaintenanceCost + "\r\n"
                + " weapons=" + weapons + "\r\n";
    }
}
