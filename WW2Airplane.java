/*This WW2Airplane class contains a default constructor, parametrized constructor, and copy constructor.
 *It contains accessor and mutator methods for its attributes. It also overrides the toString() and equals() methods 
 *The toString() method displays the necessary information for this class while the equals() method determines whether
 *or not 2 objects are equal.*/

package Aircraft_Airplane;

public class WW2Airplane extends Aircraft {
	//Attributes
	private Aircraft AircraftObject;
	private boolean TwinEngine;
	
	//Default Constructor
	public WW2Airplane() {
		this.AircraftObject = null;
		this.TwinEngine = false;
	}
	
	//Parametrized Constructor
	public WW2Airplane(double setPrice, double setMaxElevation, boolean setTwinEngine) {
		super(setPrice, setMaxElevation);
		this.TwinEngine = setTwinEngine;
	}
	
	public WW2Airplane(WW2Airplane WW2AirplaneObject) {
		this.AircraftObject = WW2AirplaneObject.AircraftObject;
		this.TwinEngine = WW2AirplaneObject.TwinEngine;
	}
	
	//mutator method for the price
	public void setPrice(double Price) {
		super.setPrice(Price);
	}
	
	//accessor method for the price
	public double getPrice() {
		return super.getPrice();
	}
	
	//mutator method for maximum elevation
	public void setMaxElevation(double MaxElevation) {
		super.setMaxElevation(MaxElevation);
	}
	
	//accessor method for maximum elevation
	public double getMaxElevation() {
		return super.getMaxElevation();
	}
	
	//mutator method for twin engine
	public void setTwinEngine(boolean TwinEngine) {
		this.TwinEngine = TwinEngine;
	}
	
	//accessor method for twin engine
	public boolean getTwinEngine() {
		return TwinEngine;
	}
	
	//Overriden toString() method
	public String toString() {
		String TwinEngineValidation;
		
		if (this.TwinEngine==true) {
			TwinEngineValidation = "has";
		} else {
			TwinEngineValidation = "does not have";
		}
		
		return "This World War II Airplane costs $" + getPrice() + " and can reach a maximum height of " + getMaxElevation() + " km in the air.\n"
				+ "Also, it " + TwinEngineValidation +" a twin engine.";
	}
	
	//Overriden equals() method
	public boolean equals(WW2Airplane Object) {
		boolean Equals = false;
		if (Object == null || this != Object) {
			Equals = false;
		}
		if ((getPrice() == Object.getPrice()) && (getMaxElevation() == Object.getMaxElevation()) && (getTwinEngine() == Object.getTwinEngine())){
			Equals = true;
		} else {
			Equals = false;
		}
		return Equals;
	}
}
