package StateDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class VendingMachine {
	
	VendorMachineState vendorMachineState;
	
	VendingMachine(){
		vendorMachineState = null;
	}
	
	
	void setState(VendorMachineState state) {
		this.vendorMachineState = state;
	}
}
