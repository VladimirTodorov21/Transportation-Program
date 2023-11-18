/*This Train class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package Train_Tram;

import WheelTrans.WheeledTransportation;//class within package imported for inheritance purposes

public class Train extends WheeledTransportation{
	//Attributes
	private WheeledTransportation WheeledObject;
	private int NumberOfVehicles;
	private String StartingStation;
	private String DestinationStation;
	
	//Default Constructor
	public Train() {
		this.WheeledObject = null;
		this.NumberOfVehicles = 0;
		this.StartingStation = null;
		this.DestinationStation = null;
	}
	
	//Parametrized constructor
	public Train(int setNumberOfWheels, double setMaxSpeed, int setNumberOfVehicles, String setStartingStation, String setDestinationStation) {
		super(setNumberOfWheels, setMaxSpeed);
		this.NumberOfVehicles = setNumberOfVehicles;
		this.StartingStation = setStartingStation;
		this.DestinationStation = setDestinationStation;
	}
	
	//Copy Constructor
	public Train(Train TrainObject) {
		this.WheeledObject = TrainObject.WheeledObject;
		this.NumberOfVehicles = TrainObject.NumberOfVehicles;
		this.StartingStation = TrainObject.StartingStation;
		this.DestinationStation = TrainObject.DestinationStation;
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
	
	//accessor method for max speed
	public double getMaxSpeed() {
		return super.getMaxSpeed();
	}
	
	//mutator method for number of vehicles
	public void setNumberOfVehicles(int NumberOfVehicles) {
		this.NumberOfVehicles = NumberOfVehicles;
	}
	
	//accessor method for number of vehicles
	public int getNumberOfVehicles() {
		return NumberOfVehicles;
	}
	
	//mutator method for starting station
	public void setStartingStation(String StartingStation) {
		this.StartingStation = StartingStation;
	}
	
	//accessor method for destination station
	public String getStartingStation() {
		if (StartingStation == null || StartingStation == "" ) {
			StartingStation = "N/A";
		}
		return StartingStation;
	}
	
	//mutator method for destination station
	public void setDestinationStation(String DestinationStation) {
		this.DestinationStation = DestinationStation;
	}
	
	//accessor method for destination station
	public String getDestinationStation() {
		if (DestinationStation == null || DestinationStation == "" ) {
			DestinationStation = "N/A";
		}
		return DestinationStation;
	}
	
	//Overriden toString() method
	public String toString() {	
		return "This Train has " + getNumberOfWheels() + " wheel(s) and has a maximum speed of " + getMaxSpeed() + " km/hr.\n"
				+ "It has " + getNumberOfVehicles() + " vehicle(s) and its starting and destination stations are " + getStartingStation() + " and " + getDestinationStation() + ".";
	}
	
	//Overriden equals() method
	public boolean equals(Train Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getNumberOfWheels() == Object.getNumberOfWheels()) && (getMaxSpeed() == Object.getMaxSpeed()) && (getNumberOfVehicles() == Object.getNumberOfVehicles()) && (getStartingStation() == Object.getStartingStation()) && (getDestinationStation() == Object.getDestinationStation())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
