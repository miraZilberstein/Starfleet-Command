package starfleet;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class StarfleetManager {
	
	
	/**
	 * Returns a list containing string representation of all fleet ships, sorted in descending order by
	 * fire power, and then in descending order by commission year, and finally in ascending order by
	 * name
	 */
	
	public static List<String> getShipDescriptionsSortedByFirePowerAndCommissionYear (Collection<Spaceship> fleet) {
		List<Spaceship> lst = new ArrayList<>();
		for(Spaceship s:fleet)
			lst.add(s);
		Collections.sort(lst, new mySpaceShipComperator());
		List<String> lstString = new ArrayList<>();
		for(Spaceship s:lst)
			lstString.add(s.toString());
		return lstString;
		
		
	}

	/**
	 * Returns a map containing ship type names as keys (the class name) and the number of instances created for each type as values
	 */
	public static Map<String, Integer> getInstanceNumberPerClass(Collection<Spaceship> fleet) {
		Map<String, Integer> m= new HashMap<String, Integer>();
		for(Spaceship s:fleet)
		{
			if(m.containsKey(s.getClass().getSimpleName()))
				m.put(s.getClass().getSimpleName(), m.get(s.getClass().getSimpleName())+1);
			else
				m.put(s.getClass().getSimpleName(), 1);
		}
		
		return m;

	}


	/**
	 * Returns the total annual maintenance cost of the fleet (which is the sum of maintenance costs of all the fleet's ships)
	 */
	public static int getTotalMaintenanceCost (Collection<Spaceship> fleet) {
		int c=0;
		for(Spaceship s:fleet)
			c+=s.getAnnualMaintenanceCost();
		return c;

	}


	/**
	 * Returns a set containing the names of all the fleet's weapons installed on any ship
	 */
	public static Set<String> getFleetWeaponNames(Collection<Spaceship> fleet) {
		Set<String> set_answer= new HashSet<>();
		for(Spaceship s:fleet)
		{
			if(myBattleShip.class.isAssignableFrom(s.getClass()))
			{
				myBattleShip b = (myBattleShip) s;
				for(Weapon w:b.getWeapon())
					set_answer.add(w.getName());
					
			}
				
				
		}
		return set_answer;

	}

	/*
	 * Returns the total number of crew-members serving on board of the given fleet's ships.
	 */
	public static int getTotalNumberOfFleetCrewMembers(Collection<Spaceship> fleet) {
		int num=0;
		for(Spaceship s:fleet)
		{
			num+=s.getCrewMember().size();
		}
		return num;

	}

	/*
	 * Returns the average age of all officers serving on board of the given fleet's ships. 
	 */
	public static float getAverageAgeOfFleetOfficers(Collection<Spaceship> fleet) {
		float sum=0;
		float num_of_fleet_officers=0;
		for(Spaceship s:fleet)
		{
			for(CrewMember c: s.getCrewMember())
			{
				if(c.getClass()==Officer.class)
				{
					num_of_fleet_officers++;
					sum+= c.getAge();
				}	
			}
		}
		return sum/num_of_fleet_officers; //(float)
		
	}

	/*
	 * Returns a map mapping the highest ranking officer on each ship (as keys), to his ship (as values).
	 */
	public static Map<Officer, Spaceship> getHighestRankingOfficerPerShip(Collection<Spaceship> fleet) {
		Map<Officer, Spaceship> m= new HashMap<Officer, Spaceship>();
		for(Spaceship s:fleet)
		{
			boolean has_officer=false;
			Officer highestRank=null;
			for(CrewMember c: s.getCrewMember())
			{
				if(c.getClass()==Officer.class)
				{
					if(!has_officer)
					{
						has_officer=true;
						highestRank=(Officer)c;
					}
					else
					{
						if(((Officer)c).getRank().compareTo(highestRank.getRank())>0 )
							highestRank =(Officer)c;
					}
				}	
			}
			if(has_officer)
				m.put(highestRank, s);
		}
		return m;

	}

	/*
	 * Returns a List of entries representing ranks and their occurrences.
	 * Each entry represents a pair composed of an officer rank, and the number of its occurrences among starfleet personnel.
	 * The returned list is sorted ascendingly based on the number of occurrences.
	 */
	public static List<Map.Entry<OfficerRank, Integer>> getOfficerRanksSortedByPopularity(Collection<Spaceship> fleet) {
		Map<OfficerRank, Integer> m= new HashMap<OfficerRank, Integer>();
		for(Spaceship s:fleet)
		{
			for(CrewMember c: s.getCrewMember())
			{
				if(c.getClass()==Officer.class)
				{
					if(m.containsKey( ((Officer)c).getRank()))
							m.put(((Officer)c).getRank(), m.get(((Officer)c).getRank())+1);
					else
						m.put(((Officer)c).getRank(), 1);
				}
			}
		}
		Set<Entry<OfficerRank, Integer>> l= m.entrySet();
		List<Map.Entry<OfficerRank, Integer>> lst= new ArrayList<Map.Entry<OfficerRank, Integer>>();
		for(OfficerRank o :m.keySet())
		{
			
			lst.add(Map.entry(o, m.get(o)));
		}
		lst.sort(new myAnotherComparator());
		return lst;
		
	}

}
