package starfleet;

import java.util.List;
import java.util.Set;

/**
 * Represents a Bomber spaceship in the Starfleet.
 * Inherits from myBattleShip and includes additional attributes specific to Bombers,
 * such as the number of technicians, which influences the annual maintenance cost.
 */
public class Bomber extends myBattleShip {
    // Number of technicians assigned to the Bomber, impacting maintenance costs
    int numberOfTechnicians;
    
    /**
     * Constructor for Bomber class.
     * 
     * @param name Name of the Bomber
     * @param commissionYear The year the Bomber was commissioned
     * @param maximalSpeed The maximal speed of the Bomber
     * @param crewMembers Set of crew members aboard the Bomber
     * @param weapons List of weapons equipped on the Bomber
     * @param numberOfTechnicians Number of technicians that can reduce maintenance costs
     */
    public Bomber(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons, int numberOfTechnicians) {
        super(name, commissionYear, maximalSpeed, crewMembers, weapons);
        this.numberOfTechnicians = numberOfTechnicians;
        int weapon_maintenanceCost = 0;
        for (Weapon w : weapons)
            weapon_maintenanceCost += w.getAnnualMaintenanceCost();
        // Adjusts the annual maintenance cost based on the number of technicians
        super.setAnnualMaintenanceCost(5000 + Math.round(weapon_maintenanceCost * (100 - numberOfTechnicians * 10) / 100));
    }

 
    public int getNumberOfTechnicians() {//Gets the number of technicians aboard the Bomber.
        return this.numberOfTechnicians;
    }

    //Returns a string representation of the Bomber, including all relevant details.
    public String toString() {
        return "Bomber\r\n"
                + "	name=" + name + "\r\n"
                + "	commissionYear=" + commissionYear + "\r\n"
                + "	maximalSpeed=" + maximalSpeed + "\r\n"
                + "	firepower=" + firePower + "\r\n"
                + "	crewMembers=" + crewMembers.size() + "\r\n"
                + "	annualMaintenanceCost=" + annualMaintenanceCost + "\r\n"
                + "	weapons=" + weapons + "\r\n"
                + "	numberOfTechnicians=" + numberOfTechnicians + "\r\n";
    }
}
