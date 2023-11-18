/*This Tarm class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package Train_Tram;

import Metro.Metro;//class within package imported for inheritance purposes

public class Tram extends Metro{

	//Attributes
	private Metro MetroObject;
	private int YearOfCreation;
	
	//Default Constructor
	public Tram() {
		this.MetroObject = null;
		this.YearOfCreation = 0;
	}
		
	//Parametrized Constructor
	public Tram (int setNumberOfWheels, double setMaxSpeed, int setNumberOfVehicles, String setStartingStation, String setDestinationStation, int setTotalStops, int setYearOfCreation) {
		super(setNumberOfWheels, setMaxSpeed, setNumberOfVehicles, setStartingStation, setDestinationStation, setTotalStops);
			
		this.YearOfCreation = setYearOfCreation;
	}
	
	//Copy Constructor
	public Tram (Tram TramObject) {
		this.MetroObject = TramObject.MetroObject;
		this.YearOfCreation = TramObject.YearOfCreation;
	}
	
	//mutator method for number of wheels
	public void setNumberOfWheels(int NumberOfWheels) {
		super.setNumberOfWheels(NumberOfWheels);
	}
		
	//accessor method for number of wheels
	public int getNumberOfWheels() {
		return super.getNumberOfWheels();
	}
		
	//mutator method for maximum speed
	public void setMaxSpeed(double MaxSpeed) {
			super.setMaxSpeed(MaxSpeed);
	}
		
	//accessor method for maximum speed
	public double getMaxSpeed() {
		return super.getMaxSpeed();
	}
		
	//mutator method for number of vehicles
	public void setNumberOfVehicles(int NumberOfVehicles) {
		super.setNumberOfVehicles(NumberOfVehicles);
	}
		
	//accessor method for number of vehicles
	public int getNumberOfVehicles() {
		return super.getNumberOfVehicles();
	}
		
	//mutator method for starting station
	public void setStartingStation(String StartingStation) {
		super.setStartingStation(StartingStation);
	}
		
	//accessor method for starting station
	public String getStartingStation() {
		return super.getStartingStation();
	}
		
	//mutator method for starting station
	public void setDestinationStation(String DestinationStation) {
		super.setDestinationStation(DestinationStation);
	}
		
	//accessor method for starting station
	public String getDestinationStation() {
		return super.getDestinationStation();
	}
		
	//mutator method for total stops
	public void setTotalStops(int TotalStops) {
		super.setTotalStops(TotalStops);;
	}
		
	//accessor method for total stops
	public int getTotalStops() {
		return super.getTotalStops();
	}
	
	//mutator method for year of creation
	public void setYearOfCreation(int YearOfCreation) {
		this.YearOfCreation = YearOfCreation;
	}
	
	//accessor method for year of creation
	public int getYearOfCreation() {
		return YearOfCreation;
	}
	
	//Overriden toString() method
	public String toString() {
		return "This Tram has " + getNumberOfWheels() + " wheel(s) and has a maximum speed of " + getMaxSpeed() + " km/hr.\n"
				+ "It has " + getNumberOfVehicles() + " vehicle(s) and its starting and destination stations are " + getStartingStation() + " and " + getDestinationStation() + ".\n"
				+ "It has stopped " + getTotalStops() + " times. Also, it was found in the year " + getYearOfCreation() + ".";
	}
		
	//Overriden equals() method
	public boolean equals(Tram Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getNumberOfWheels() == Object.getNumberOfWheels()) && (getMaxSpeed() == Object.getMaxSpeed()) && (getNumberOfVehicles() == Object.getNumberOfVehicles()) && (getStartingStation() == Object.getStartingStation()) && (getDestinationStation() == Object.getDestinationStation()) && (getTotalStops() == Object.getTotalStops()) && (getYearOfCreation() == Object.getYearOfCreation())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
