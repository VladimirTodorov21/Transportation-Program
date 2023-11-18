/*This WheeledTransportation class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package WheelTrans;

public class WheeledTransportation {
	//Attributes
	private int NumberOfWheels;
	private double MaxSpeed;
	
	//Default Constructor
	public WheeledTransportation() {
		this.NumberOfWheels = 0;
		this.MaxSpeed = 0.0;
	}
	
	//Parametrized Constructor
	public WheeledTransportation(int setNumberOfWheels, double setMaxSpeed) {
		this.NumberOfWheels = setNumberOfWheels;
		this.MaxSpeed = setMaxSpeed;
	}
	
	//Copy Constructor
	public WheeledTransportation (WheeledTransportation WheeledObject) {
		this.NumberOfWheels = WheeledObject.NumberOfWheels;
		this.MaxSpeed = WheeledObject.MaxSpeed;
	}
	
	//mutator method for number of wheels
	public void setNumberOfWheels(int NumberOfWheels) {
		this.NumberOfWheels = NumberOfWheels;
	}
	
	//accessor method for number of wheels
	public int getNumberOfWheels() {
		return NumberOfWheels;
	}
	
	//mutator method for maximum speed
	public void setMaxSpeed(double MaxSpeed) {
		this.MaxSpeed = MaxSpeed;
	}
	
	//accessor method for max speed
	public double getMaxSpeed() {
		return MaxSpeed;
	}
	
	//Overriden toString() method
	public String toString() {
		return "This WheeledTransportation has " + getNumberOfWheels() + " wheel(s) and has a maximum speed of " + getMaxSpeed() + " km/hr.";
	}
	
	//Overriden equals() method
	public boolean equals(WheeledTransportation Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getNumberOfWheels() == Object.getNumberOfWheels()) && (getMaxSpeed() == Object.getMaxSpeed())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
