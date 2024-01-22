package starfleet;

import java.util.Set;

public class TransportShip extends myAbstractSpaceShip{
	int cargoCapacity;
	int passengerCapacity;
	int annualMaintenanceCost;
	int firePower;

	
	public TransportShip(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, int cargoCapacity, int passengerCapacity){
		super(name,commissionYear,maximalSpeed,crewMembers);
		this.annualMaintenanceCost = 3000 + 5*cargoCapacity + 3*passengerCapacity;
		this.cargoCapacity = cargoCapacity;
		this.passengerCapacity = passengerCapacity;
		this.firePower = 10;
	
	}
	public int getCargoCapacity() {return this.cargoCapacity;}
	public int getPassengerCapacity() {return this.passengerCapacity;}
	public int getFirePower() {return this.firePower;}
	public int getannualMaintenanceCostCost() {return this.annualMaintenanceCost;}
	
	public String toString()
	{
		return "TransportShip\r\n"
				+ "	name="+name+"\r\n"
				+ "	commissionYear="+commissionYear+"\r\n"
				+ "	maximalSpeed="+maximalSpeed+"\r\n"
				+ "	firepower="+firePower+"\r\n"
				+ "	crewMembers="+crewMembers.size()+"\r\n"
				+ "	annualMaintenanceCostCost="+annualMaintenanceCost+"\r\n"
				+ "	cargoCapacity="+cargoCapacity+"\r\n"
				+ "	passengerCapacity="+passengerCapacity+"\r\n";
				
				
	}
	@Override
	public int getAnnualMaintenanceCost() {
		return this.annualMaintenanceCost;
	}

}
