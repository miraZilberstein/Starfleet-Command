package starfleet;

import java.util.Comparator;

/**
 * Compares two spaceship objects first by firepower, then by commission year, 
 * and finally alphabetically by name if needed.
 */
public class mySpaceShipComperator implements Comparator<Spaceship>{
    
    /**
     * Compares two Spaceships.
     */
    public int compare(Spaceship a, Spaceship b) {
        // Firepower comparison
        if(a.getFirePower() != b.getFirePower())
            return Integer.compare(b.getFirePower(), a.getFirePower());
        
        // Commission year comparison
        if(a.getCommissionYear() != b.getCommissionYear())
            return Integer.compare(b.getCommissionYear(), a.getCommissionYear());
        
        // Name comparison
        for(int i = 0; i < Math.max(a.getName().length(), b.getName().length()); i++) {
            if(a.getName().charAt(i) != b.getName().charAt(i))
                return Character.compare(a.getName().charAt(i), b.getName().charAt(i));
        }
        
        // Compare by name length if one is a prefix of the other
        return Integer.compare(a.getName().length(), b.getName().length());
    }
}
