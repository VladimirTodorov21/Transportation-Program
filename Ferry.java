/*This Ferry class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package Ferry;

public class Ferry {
	//Attributes
	private double MaxSpeed;
	private double MaxLoad;
	
	//Default Constructor
	public Ferry() {
		this.MaxSpeed = 0.0;
		this.MaxLoad = 0.0;
	}
	
	//Parametrized Constructor
	public Ferry(double setMaxSpeed, double setMaxLoad) {
		this.MaxSpeed = setMaxSpeed;
		this.MaxLoad = setMaxLoad;
	}
	
	//Copy Constructor
	public Ferry(Ferry FerryObject) {
		this.MaxSpeed = FerryObject.MaxSpeed;
		this.MaxLoad = FerryObject.MaxLoad;
	}
	
	//mutator method for the maximum speed
	public void setMaxSpeed(double MaxSpeed) {
		this.MaxSpeed = MaxSpeed;
	}
	
	//accessor method for the maximum speed
	public double getMaxSpeed() {
		return MaxSpeed;
	}
	
	//mutator method for maximum load
	public void setMaxLoad(double MaxLoad) {
		this.MaxLoad = MaxLoad;
	}
	
	//accessor method for maximum load
	public double getMaxLoad() {
		return MaxLoad;
	}
	
	//Overriden toString() method
	public String toString() {
		return "This Ferry has a maximum speed of " + getMaxSpeed() + " km/hr and can carry a maximum load of " + getMaxLoad() + " lbs.";
	}
	
	//Overriden equals() method
	public boolean equals(Ferry Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getMaxSpeed() == Object.getMaxSpeed()) && (getMaxLoad() == Object.getMaxLoad())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
