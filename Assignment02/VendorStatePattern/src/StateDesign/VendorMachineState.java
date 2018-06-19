package StateDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public interface VendorMachineState {
	
	void insertCoin(double value);
	void selectDrinks(int option);
	void deliverDrinks();
//	void changeDrinks();
	double returnExtraCurrency();
}
