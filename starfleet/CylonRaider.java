package starfleet;

import java.util.List;
import java.util.Set;

/**
 * Represents the Cylon Raider, a specialized battleship within the Cylon fleet component of the Starfleet.
 * Known for its speed and agility in combat, this ship is manned exclusively by Cylon crew members.
 */
public class CylonRaider extends myBattleShip {

    /**
     * Constructs a CylonRaider with specified details.
     * @param name The name of the Raider.
     * @param commissionYear The year the ship was commissioned into service.
     * @param maximalSpeed The maximum speed of the Raider.
     * @param crewMembers A set of Cylon crew members manning the Raider.
     * @param weapons A list of weapons equipped on the Raider.
     */
    public CylonRaider(String name, int commissionYear, float maximalSpeed, Set<Cylon> crewMembers,
                       List<Weapon> weapons) {
        super(name, commissionYear, maximalSpeed, crewMembers, weapons); // Calls the constructor of the superclass
        int annualMaintenance = 3500; // Base annual maintenance cost
        // Adds the maintenance cost of each weapon to the annual maintenance
        for (Weapon w : super.weapons)
            annualMaintenance += w.getAnnualMaintenanceCost();
        // Adds a fixed maintenance cost for each Cylon crew member
        for (CrewMember c : super.crewMembers)
            annualMaintenance += 500;
        // Additional maintenance cost based on the ship's speed
        annualMaintenance += Math.round(1200 * maximalSpeed);
        super.setAnnualMaintenanceCost(annualMaintenance); // Updates the annual maintenance cost
    }

    //Returns a string representation of the CylonRaider.
    public String toString() {
        return "CylonRaider\r\n"
                + " name=" + name + "\r\n"
                + " commissionYear=" + commissionYear + "\r\n"
                + " maximalSpeed=" + maximalSpeed + "\r\n"
                + " firepower=" + firePower + "\r\n"
                + " crewMembers=" + crewMembers.size() + "\r\n"
                + " annualMaintenanceCost=" + annualMaintenanceCost + "\r\n"
                + " weapons=" + weapons + "\r\n"; 
    }
}
