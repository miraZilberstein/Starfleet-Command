package starfleet;

import java.util.List;
import java.util.Set;

/**
 * Represents the general concept of a battleship within the Starfleet, including weaponry and firepower.
 * This class extends myAbstractSpaceShip, adding specific attributes and functionalities for battle capabilities.
 */
public abstract class myBattleShip extends myAbstractSpaceShip {
    List<Weapon> weapons; // Equipped weapons
    int firePower = 10; // Base firepower, increases with weapons
    int annualMaintenanceCost; // Maintenance cost

    /**
     * Initializes battleship properties.
     */
    public myBattleShip(String name, int commissionYear, float maximalSpeed, Set<? extends CrewMember> crewMembers, List<Weapon> weapon) {
        super(name, commissionYear, maximalSpeed, crewMembers);
        this.weapons = weapon;
        for (Weapon w : weapons) { // Calculate total firepower
            this.firePower += w.getFirePower();
        }
    }

    // Accessor and mutator methods
    public void setAnnualMaintenanceCost(int a) { this.annualMaintenanceCost = a; }
    public int getAnnualMaintenanceCost() { return this.annualMaintenanceCost; }
    public List<Weapon> getWeapon() { return this.weapons; }
    public int getFirePower() { return this.firePower; }
}
