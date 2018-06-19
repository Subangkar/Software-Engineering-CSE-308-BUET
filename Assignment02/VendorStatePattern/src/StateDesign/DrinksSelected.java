package StateDesign;

/**
 * Created by Subangkar on 19-Jun-18.
 */
public class DrinksSelected implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public DrinksSelected( VendingMachine vendingMachine ) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin( double value ) {
	
	}
	
	@Override
	public void selectDrinks( int option ) {
	
	}
	
	@Override
	public void deliverDrinks() {
	
	}
	
	@Override
	public void changeDrinks() {
	
	}
	
	@Override
	public double returnExtraCurrency() {
		return 0;
	}
}
