/*This Metro class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package Metro;

import Train_Tram.Train;//class within package imported for inheritance purposes

public class Metro extends Train {
	//Attributes
	private Train TrainObject;
	private int TotalStops;
	
	//Default Constructor
	public Metro() {
		this.TrainObject = null;
		this.TotalStops = 0;
	}
	
	//Parametrized Constructor
	public Metro (int setNumberOfWheels, double setMaxSpeed, int setNumberOfVehicles, String setStartingStation, String setDestinationStation, int setTotalStops) {
		super(setNumberOfWheels, setMaxSpeed, setNumberOfVehicles, setStartingStation, setDestinationStation);
		
		int StationCount;
		
		if (setStartingStation != null && setDestinationStation != null) {
			StationCount = 2;
		} else if (setStartingStation == null && setDestinationStation != null) {
			StationCount = 1;
		} else if (setStartingStation != null && setDestinationStation == null) {
			StationCount = 1;
		} else {
			StationCount = 0;
		}
		
		this.TotalStops = setTotalStops + StationCount;
	}
	
	//Copy Constructor
	public Metro(Metro MetroObject) {
		this.TrainObject = MetroObject.TrainObject;
		this.TotalStops = MetroObject.TotalStops;
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
		this.TotalStops = TotalStops;
	}
	
	//accessor method for total stops
	public int getTotalStops() {
		return TotalStops;
	}
	
	//Overriden toString() method
	public String toString() {
		return "This Metro has " + getNumberOfWheels() + " wheel(s) and has a maximum speed of " + getMaxSpeed() + " km/hr.\n"
				+ "It has " + getNumberOfVehicles() + " vehicle(s) and its starting and destination stations are " + getStartingStation() + " and " + getDestinationStation() + ".\n"
				+ "It has stopped " + getTotalStops() + " times.";
	}
	
	//Overriden equals() method
	public boolean equals(Metro Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getNumberOfWheels() == Object.getNumberOfWheels()) && (getMaxSpeed() == Object.getMaxSpeed()) && (getNumberOfVehicles() == Object.getNumberOfVehicles()) && (getStartingStation() == Object.getStartingStation()) && (getDestinationStation() == Object.getDestinationStation()) && (getTotalStops() == Object.getTotalStops())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
