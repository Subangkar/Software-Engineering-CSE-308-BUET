package StateDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class InitialState implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public InitialState( VendingMachine vendingMachine ) {
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
	public double changeCurrency() {
		return 0;
	}
}
