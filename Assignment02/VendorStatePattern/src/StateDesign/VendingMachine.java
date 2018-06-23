package StateDesign;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class VendingMachine {
	
	private VendorMachineState vendorMachineState;
	
	private ArrayList< DrinkSupply > drinkSupplyList;
	
	private double cash;
	
	private double insertedCash;
	private String selectedDrinkName;
	
	private boolean hasDrink, hasEnoughCash, hasEnoughCan;
	private DrinkSupply selectedDrink;
	
	VendingMachine( DrinkSupply[] drinkSupplyList ) {
		vendorMachineState = new InitialState( this );
		this.drinkSupplyList = new ArrayList( Arrays.asList( drinkSupplyList ) );
		insertedCash = 0;
		cash = 1000;
	}
	
	double getInsertedCash() {
		return insertedCash;
	}
	
	void setInsertedCash( double insertedCash ) {
		this.insertedCash = insertedCash;
	}
	
	String getSelectedDrinkName() {
		return selectedDrinkName;
	}
	
	void setSelectedDrinkName( String selectedDrinkName ) {
		this.selectedDrinkName = selectedDrinkName;
	}
	
	ArrayList< DrinkSupply > getDrinkSupplyList() {
		return drinkSupplyList;
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
	
	void getReturnCash() {
		vendorMachineState.returnExtraCurrency();
	}
	
	public boolean isHasDrink() {
		return hasDrink;
	}
	
	public void setHasDrink( boolean hasDrink ) {
		this.hasDrink = hasDrink;
	}
	
	public boolean isHasEnoughCash() {
		return hasEnoughCash;
	}
	
	public void setHasEnoughCash( boolean hasEnoughCash ) {
		this.hasEnoughCash = hasEnoughCash;
	}
	
	public boolean isHasEnoughCan() {
		return hasEnoughCan;
	}
	
	public void setHasEnoughCan( boolean hasEnoughCan ) {
		this.hasEnoughCan = hasEnoughCan;
	}
	
	public DrinkSupply getSelectedDrink() {
		return selectedDrink;
	}
	
	public void setSelectedDrink( DrinkSupply selectedDrink ) {
		this.selectedDrink = selectedDrink;
	}
	
	public double getCash() {
		return cash;
	}
	
	public void setCash( double cash ) {
		this.cash = cash;
	}
	
	public void showAvailableItems() {
		for (DrinkSupply drink : drinkSupplyList) {
			System.out.println( ">> " + drink.name + " " + drink.pricePerCan + "$" );
		}
		System.out.println( "Total Profit: " + cash );
	}
	
}
