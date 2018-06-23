package StateDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public interface VendorMachineState {
	
	void insertCoin();
	void selectDrinks();
	void returnExtraCurrency();
	
	void getDrink();
}
