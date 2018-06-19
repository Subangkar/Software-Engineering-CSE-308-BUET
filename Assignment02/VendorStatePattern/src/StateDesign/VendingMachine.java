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
	
	public double getInsertedCash() {
		return insertedCash;
	}
	
	public void setInsertedCash( double insertedCash ) {
		this.insertedCash = insertedCash;
	}
	
	public String getSelectedDrinks() {
		return selectedDrinks;
	}
	
	public void setSelectedDrinks( String selectedDrinks ) {
		this.selectedDrinks = selectedDrinks;
	}
	
	public ArrayList< DrinkSupply > getDrinkSupplyList() {
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
	
	void getDrinks() {
		vendorMachineState.deliverDrinks();
	}
	
	void getMoney() {
		vendorMachineState.returnExtraCurrency();
	}
	
	public void showAvailableItems() {
		for (DrinkSupply drink : drinkSupplyList) {
			System.out.println( ">> " + drink.name + " " + drink.pricePerCan + "$" );
		}
	}
	
	public void addDrinks( DrinkSupply drinkSupply ) {
		drinkSupplyList.add( drinkSupply );
	}
	
}
