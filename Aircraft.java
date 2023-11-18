/*This Aircraft class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package Aircraft_Airplane;

public class Aircraft {
	//Attributes
	private double Price;
	private double MaxElevation;
	
	//Default Constructor
	public Aircraft() {
		this.Price = 0.0;
		this.MaxElevation = 0.0;
	}
	
	//Parametrized Constructor
	public Aircraft(double setPrice, double setMaxElevation) {
		this.Price = setPrice;
		this.MaxElevation = setMaxElevation;
	}
	
	//Copy Constructor
	public Aircraft(Aircraft AircraftObject) {
		this.Price = AircraftObject.Price;
		this.MaxElevation = AircraftObject.MaxElevation;
	}
	
	//mutator method for the price
	public void setPrice(double Price) {
		this.Price = Price;
	}
	
	//accessor method for the price
	public double getPrice() {
		return Price;
	}
	
	//mutator method for maximum elevation
	public void setMaxElevation(double MaxElevation) {
		this.MaxElevation = MaxElevation;
	}
	
	//accessor method for maximum elevation
	public double getMaxElevation() {
		return MaxElevation;
	}
	
	//Overriden toString() method
	public String toString() {
		return "This Aircraft costs $" + getPrice() + " and can reach a maximum height of " + getMaxElevation() + " km in the air.";
	}
	
	//Overriden equals() method
	public boolean equals(Aircraft Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getPrice() == Object.getPrice()) && (getMaxElevation() == Object.getMaxElevation())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
