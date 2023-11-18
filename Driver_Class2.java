/*This driver class for Part 2 imports all the classes from their respective packages necessary to run the code.
 *The class contains a static method called copyTheObjects() and a main() method.
 *The static method finds creates a copy array by inserting objects from the parameter array into it by the use of
 *instanceof to determine which instance does a specific object within the parameter array belongs to. 
 *In the main method, 16 objects with paramterized constructors are created.
 *The program tests the copyTheObjects() method.*/

package comp249_assignment2;

import java.util.Arrays;

/*Classes within their respective packages are imported to be accessed by the driver class*/
import Aircraft_Airplane.Aircraft;
import Aircraft_Airplane.WW2Airplane;
import Monowheel.Monowheel;
import Train_Tram.Train;
import Train_Tram.Tram;
import WheelTrans.WheeledTransportation;
import Ferry.Ferry;
import Metro.Metro;

public class TransportationDriverPart2 {
	
	//Static method that returns a copy of an array
	public static Object[] copyTheObjects(Object[] arrayOfObjects) {
		Object[] copyArrayOfObjects = new Object[arrayOfObjects.length];
		for (int i = 0; i<copyArrayOfObjects.length;i++) {
			if (arrayOfObjects[i] instanceof WheeledTransportation) {
				copyArrayOfObjects[i] = (WheeledTransportation)arrayOfObjects[i];
			}
			if (arrayOfObjects[i] instanceof Train) {
				copyArrayOfObjects[i] = (Train)arrayOfObjects[i];
			}
			if (arrayOfObjects[i] instanceof Metro) {
				copyArrayOfObjects[i] = (Metro)arrayOfObjects[i];
			}
			if (arrayOfObjects[i] instanceof Tram) {
				copyArrayOfObjects[i] = (Tram)arrayOfObjects[i];
			}
			if (arrayOfObjects[i] instanceof Monowheel) {
				copyArrayOfObjects[i] = (Monowheel)arrayOfObjects[i];
			}
			if (arrayOfObjects[i] instanceof Ferry) {
				copyArrayOfObjects[i] = (Ferry)arrayOfObjects[i];
			}
			if (arrayOfObjects[i] instanceof Aircraft) {
				copyArrayOfObjects[i] = (Aircraft)arrayOfObjects[i];
			}
			if (arrayOfObjects[i] instanceof WW2Airplane) {
				copyArrayOfObjects[i] = (WW2Airplane)arrayOfObjects[i];
			}
		}
		return copyArrayOfObjects;
	}
	
	public static void main(String[] args) {
		
		/*16 different objects created which 8 of them are pairs of 2*/
		WheeledTransportation t1 = new WheeledTransportation(14,103.0);
		WheeledTransportation t2 = new WheeledTransportation(16,89.5);
		
		Train t3 = new Train(7, 38.3, 4, "Montreal", "Toronto");
		Train t4 = new Train(4, 34.2, 5, "Georgia", "Florida");
		
		Metro t5 = new Metro(13, 20.1, 4, "Longueuil", "Chateauguay", 8);
		Metro t6 = new Metro(10, 41.6, 3, "New York", "North Carolina", 8);
		
		Tram t7 = new Tram(7, 74.9, 3, "Quebec", "Brossard", 6, 2003);
		Tram t8 = new Tram(11, 54.3, 4, "Gaspesie", "Levis", 10, 2005);
		
		Monowheel t9 = new Monowheel(1,43.5, 200.0);
		Monowheel t10 = new Monowheel(1,58.0, 500.8);
		
		Ferry t11 = new Ferry(70.0, 7800.00);
		Ferry t12 = new Ferry(120.0, 3900.00);
		
		Aircraft t13 = new Aircraft(60000.00, 3.7);
		Aircraft t14 = new Aircraft(37500.00, 2.7);
		
		WW2Airplane t15 = new WW2Airplane(53000.00, 2.1, true);
		WW2Airplane t16 = new WW2Airplane(83500.00, 1.3, false);
		
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
		
		//Welcome message
		System.out.println("===================================");
		System.out.println("| Welcome to Trans Info Services! |");
		System.out.println("===================================\n");
		
		System.out.println("--------------------------------------");
		System.out.println("  Testing the copyTheObjects method");
		System.out.println("--------------------------------------\n");
		
		System.out.println(Arrays.deepToString(copyTheObjects(arrt)));
		
		//Program terminates with closing message
		System.out.println("\n====================================");
		System.out.println("| Thank you for using the program! |");
		System.out.println("====================================");
	}
}
