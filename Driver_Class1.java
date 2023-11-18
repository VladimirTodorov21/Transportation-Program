/*This driver class for Part 1 imports all the classes from their respective packages necessary to run the code.
 *The class contains a static method called findLeastAndMostExpensiveAircraft() and a main() method.
 *The static method finds which of the objects are instances of the Aircraft class and finds the least And most
 *expensive aircrafts out all of them. If there are no instances of the Aircraft class, then a message is displayed
 *saying there are no such objects.
 *In the main method, 16 objects with parametrized constructors are created and are mixed in 2 seperate arrays.
 *The program tests the toString(), equals(), and findLeastAndMostExpensiveAircraft() methods*/

package comp249_assignment2;

/*Classes within their respective packages are imported to be accessed by the driver class*/
import Aircraft_Airplane.Aircraft;
import Aircraft_Airplane.WW2Airplane;
import Monowheel.Monowheel;
import Train_Tram.Train;
import Train_Tram.Tram;
import WheelTrans.WheeledTransportation;
import Ferry.Ferry;
import Metro.Metro;

public class TransportationDriverPart1 {
	
	//Static method for finding least and most expensive aircrafts
	public static String findLeastAndMostExpensiveAircraft(Object[] arrayOfObjects) {
		Aircraft[] arrayOfAircraft = new Aircraft[10];
		String OutputLeast = "";
		String OutputMost = "";
		int arrayIndex = 0;
		double LeastExpensive = 1000000;
		double MostExpensive = 0;
		
		for(int i=0; i < arrayOfObjects.length; i++) {
			if (arrayOfObjects[i] instanceof Aircraft) {
				arrayOfAircraft[arrayIndex++] = (Aircraft)arrayOfObjects[i];
			}
		}
		
		for (int j=0; j<arrayOfAircraft.length;j++) {
			if (arrayOfAircraft[j] != null) {
				if (arrayOfAircraft[j].getPrice() > MostExpensive) {
					MostExpensive = arrayOfAircraft[j].getPrice();
				}
				if (arrayOfAircraft[j].getPrice() < LeastExpensive) {
					LeastExpensive = arrayOfAircraft[j].getPrice();
				}
			}
		} 
		
		if (arrayOfAircraft[0] == null) {
			return "There are no aircraft objects";
		} else {
			for (int k=0; k<arrayOfAircraft.length;k++) {
				if (arrayOfAircraft[k] != null) {
					if (arrayOfAircraft[k].getPrice() == LeastExpensive) {
						OutputLeast += arrayOfAircraft[k].toString();
					}
					if (arrayOfAircraft[k].getPrice() == MostExpensive) {
						OutputMost += arrayOfAircraft[k].toString();
					}
				}
			}
			return "Least expensive Aircraft:\n" + OutputLeast + "\n\nMost expensive Aircraft:\n" + OutputMost;
		}
	}
	
	public static void main(String[] args) {
		
		/*16 different objects created which 8 of them are pairs of 2*/
		WheeledTransportation t1 = new WheeledTransportation(6,81.5);
		WheeledTransportation t2 = new WheeledTransportation(6,81.5);
		
		Train t3 = new Train(5, 70.9, 4, "Montreal", "Toronto");
		Train t4 = new Train(5, 70.9, 4, "Montreal", "Toronto");
		
		Metro t5 = new Metro(5, 70.9, 4, "Quebec", "Brossard", 8);
		Metro t6 = new Metro(1, 81.5, 4, "New York", "North Carolina", 8);
		
		Tram t7 = new Tram(5, 70.9, 4, "Quebec", "Brossard", 7, 2002);
		Tram t8 = new Tram(5, 70.9, 4, "Quebec", "Brossard", 8, 2002);
		
		Monowheel t9 = new Monowheel(6,81.5, 899.8);
		Monowheel t10 = new Monowheel(1,81.5, 899.8);
		
		Ferry t11 = new Ferry(90.0, 5000.00);
		Ferry t12 = new Ferry(90.0, 4500.00);
		
		Aircraft t13 = new Aircraft(90000.00, 3.7);
		Aircraft t14 = new Aircraft(67500.00, 2.7);
		
		WW2Airplane t15 = new WW2Airplane(53000.00, 3.7, true);
		WW2Airplane t16 = new WW2Airplane(67500.00, 2.7, false);
		
		//array storing the objects created
		Object[] arrt = new Object[16];
		
		arrt[0] = t1;
		arrt[1] = t2;
		arrt[2] = t3;
		arrt[3] = t4;
		arrt[4] = t5;
		arrt[5] = t6;
		arrt[6] = t7;
		arrt[7] = t8;
		arrt[8] = t9;
		arrt[9] = t10;
		arrt[10] = t11;
		arrt[11] = t12;
		arrt[12] = t13;
		arrt[13] = t14;
		arrt[14] = t15;
		arrt[15] = t16;
		
		Object[] Secondarrt = new Object[16];
		
		Secondarrt[0] = t1;
		Secondarrt[1] = t2;
		Secondarrt[2] = t3;
		Secondarrt[3] = t4;
		Secondarrt[4] = t5;
		Secondarrt[5] = t6;
		Secondarrt[6] = t7;
		Secondarrt[7] = t8;
		Secondarrt[8] = t9;
		Secondarrt[9] = t10;
		Secondarrt[10] = t11;
		Secondarrt[11] = t12;
		Secondarrt[12] = t1;
		Secondarrt[13] = t2;
		Secondarrt[14] = t3;
		Secondarrt[15] = t4;
		
		//Welcome message
		System.out.println("===================================");
		System.out.println("| Welcome to Trans Info Services! |");
		System.out.println("===================================\n");
		
		System.out.println("--------------------------------------");
		System.out.println("Testing the information of all objects");
		System.out.println("--------------------------------------\n");
		
		//prints content within a specific object in the array
		for(int i=0; i <arrt.length; i++) {
			System.out.println("Transport " + (i+1) + ":\n" + arrt[i].toString() +"\n");
		}
		
		System.out.println("--------------------------------------");
		System.out.println("Testing the equality between 2 objects");
		System.out.println("--------------------------------------\n");
		
		/*Testing overriden equals() methods*/
		System.out.println("Same classes: Are the 2 wheeled transportations (t1 and t2) equal? " + t1.equals(t2) + "\n");
		
		System.out.println("Same classes: Are the 2 ferries (t11 and t12) equal? " + t11.equals(t12) + "\n");
		
		System.out.println("Different classes: Are the metro (t6) and monowheel (t10) equal? " + t6.equals(t10) + "\n");
		
		System.out.println("Different classes: Are the train (t3) and monowheel (t9) equal? " + t3.equals(t9) + "\n");
		
		System.out.println("Similar values: Are the aircraft (t14) and World War II Airplane (t16) equal? " + t14.equals(t16) + "\n");
		
		System.out.println("Similar values: Are the metro (t5) and tram (t7) equal? " + t5.equals(t7));
	
		System.out.println("\n--------------------------------------");
		System.out.println("Finding Least/Most Expensive Aircrafts");
		System.out.println("--------------------------------------\n");
		
		System.out.println("-----First array-----\n\n" + findLeastAndMostExpensiveAircraft(arrt));
		
		System.out.println("\n-----Second array-----\n" + findLeastAndMostExpensiveAircraft(Secondarrt));
		
		//Program terminates with closing message
		System.out.println("\n====================================");
		System.out.println("| Thank you for using the program! |");
		System.out.println("====================================");
	}
}
