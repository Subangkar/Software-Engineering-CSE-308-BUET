package StateDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class DeliverDrinkState implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public DeliverDrinkState( VendingMachine vendingMachine ) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin() {
	
	}
	
	@Override
	public void selectDrinks() {
	
	}
	
	@Override
	public void deliverDrinks() {

	}
	
	@Override
	public void returnExtraCurrency() {
	
	}
}
