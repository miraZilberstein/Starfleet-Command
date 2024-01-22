package starfleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 * Represents a Stealth Cruiser spaceship in the Starfleet, extending Fighter with additional attributes.
 */
public class StealthCruiser extends Fighter {
    static int numOfStealthCruiser;

    // Constructor with weapons
    public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons) {
        super(name, commissionYear, maximalSpeed, crewMembers, weapons);
        numOfStealthCruiser += 1;
    }

    // Constructor without weapons (defaults to Laser Cannons)
    public StealthCruiser(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers) {
        super(name, commissionYear, maximalSpeed, crewMembers, weaponToList(new Weapon("Laser Cannons", 10, 100)));
        numOfStealthCruiser += 1;
    }

    // Convert a single weapon to a list
    public static List<Weapon> weaponToList(Weapon w) {
        List<Weapon> lst = new ArrayList<Weapon>();
        lst.add(w);
        return lst;
    }

    // String representation of StealthCruiser
    public String toString() {
        return "StealthCruiser\r\n"
                + "    name=" + name + "\r\n"
                + "    commissionYear=" + commissionYear + "\r\n"
                + "    maximalSpeed=" + maximalSpeed + "\r\n"
                + "    firepower=" + firePower + "\r\n"
                + "    crewMembers=" + crewMembers.size() + "\r\n"
                + "    annualMaintenanceCost=" + this.getAnnualMaintenanceCost() + "\r\n"
                + "    weapons=" + weapons + "\r\n";
    }

    @Override
    public int getAnnualMaintenanceCost() {
        return this.annualMaintenanceCost + 50 * numOfStealthCruiser;
    }
}
