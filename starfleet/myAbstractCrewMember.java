package starfleet;

import java.util.Objects;

/**
 * Abstract class representing a generic crew member in the Starfleet.
 * Implements the CrewMember interface to ensure all concrete crew member classes provide basic details.
 */
public abstract class myAbstractCrewMember implements CrewMember {
    String name; // The name of the crew member
    int age; // The age of the crew member
    int yearsInService; // The number of years the crew member has been in service

   //Constructs a myAbstractCrewMember with specified age, years in service, and name.
    public myAbstractCrewMember(int age, int yearsInService, String name) {
        this.name = name;
        this.age = age;
        this.yearsInService = yearsInService;
    }

    public String getName() {//Returns the name of the crew member.
        return this.name;
    }

    public int getAge() {//Returns the age of the crew member.
        return this.age;
    }

    public int getYearsInService() {//Returns the number of years the crew member has been in service.
        return this.yearsInService;
    }

  
    @Override
    public int hashCode() {//Generates a hash code for a crew member based on their name.
        return Objects.hash(name); // Uses name for hash code as it's a unique identifier
    }

    
    //Compares this crew member to another object for equality, based primarily on name.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Self check
            return true;
        if (obj == null) // Null check
            return false;
        if (getClass() != obj.getClass()) // Type check
            return false;
        myAbstractCrewMember other = (myAbstractCrewMember) obj;
        return Objects.equals(name, other.name); // Field comparison
    }
}
