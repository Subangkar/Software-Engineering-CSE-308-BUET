package StateDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class VendingMachine {
	
	private VendorMachineState vendorMachineState;
	
	ArrayList<String> drinks;
	ArrayList<Integer> capacity;
	ArrayList<Double> pricePerCan;
	
	VendingMachine( ArrayList<String> drinks,ArrayList<Integer> capacity ){
		vendorMachineState = null;
		this.drinks = drinks;
		this.capacity = capacity;
	}
	
	
	void setState(VendorMachineState state) {
		this.vendorMachineState = state;
	}
	
	public VendorMachineState getVendorMachineState() {
		return vendorMachineState;
	}
	
	
	void showAvailableItems(){

	}
}
