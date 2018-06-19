package StateDesign;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class VendingMachine {
	
	private VendorMachineState vendorMachineState;
	
	private ArrayList< DrinkSupply > drinkSupplyList;
	
	private double insertedCash;
	private String selectedDrinks;
	
	double getInsertedCash() {
		return insertedCash;
	}
	
	void setInsertedCash( double insertedCash ) {
		this.insertedCash = insertedCash;
	}
	
	String getSelectedDrinks() {
		return selectedDrinks;
	}
	
	void setSelectedDrinks( String selectedDrinks ) {
		this.selectedDrinks = selectedDrinks;
	}
	
	ArrayList< DrinkSupply > getDrinkSupplyList() {
		return drinkSupplyList;
	}
	
	VendingMachine( DrinkSupply[] drinkSupplyList ) {
		vendorMachineState = new InitialState( this );
		this.drinkSupplyList = new ArrayList( Arrays.asList( drinkSupplyList ) );
		insertedCash = 0;
	}
	
	void setState( VendorMachineState state ) {
		this.vendorMachineState = state;
	}
	
	void insertCoin() {
		vendorMachineState.insertCoin();
	}
	
	void selectItem() {
		vendorMachineState.selectDrinks();
	}
	
	void getCash() {
		vendorMachineState.returnExtraCurrency();
	}
	
	public void showAvailableItems() {
		for (DrinkSupply drink : drinkSupplyList) {
			System.out.println( ">> " + drink.name + " " + drink.pricePerCan + "$" );
		}
	}
	
}
