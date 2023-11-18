/*This Monowheel class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package Monowheel;

import WheelTrans.WheeledTransportation;//class within package imported for inheritance purposes

public class Monowheel extends WheeledTransportation{
	//Attributes
	private WheeledTransportation WheeledObject;
	private double MaxWeight;
	
	//Default Constructor
	public Monowheel() {
		this.WheeledObject = null;
		this.MaxWeight = 0.0;
	}
	
	//Parametrized constructor
	public Monowheel(int setNumberOfWheels, double setMaxSpeed, double setMaxWeight) {
		super(setNumberOfWheels, setMaxSpeed);
		this.MaxWeight = setMaxWeight;
	}
	
	//Copy Constructor
	public Monowheel(Monowheel MonowheeledObject) {
		this.WheeledObject = MonowheeledObject.WheeledObject;
		this.MaxWeight = MonowheeledObject.MaxWeight;
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
	
	//mutator method for maximum weight
	public void setMaxWeight(int MaxWeight) {
		this.MaxWeight = MaxWeight;
	}
	
	//accessor method for maximum weight
	public double getMaxWeight() {
		return MaxWeight;
	}
	
	//Overriden toString() method
	public String toString() {
		return "This Monowheel has " + getNumberOfWheels() + " wheel(s) and has a maximum speed of " + getMaxSpeed() + " km/hr.\n"
				+ "It weighs " + getMaxWeight() + " lbs.";
	}
	
	//Overriden equals() method
	public boolean equals(Monowheel Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getNumberOfWheels() == Object.getNumberOfWheels()) && (getMaxSpeed() == Object.getMaxSpeed()) && (getMaxWeight() == Object.getMaxWeight())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
