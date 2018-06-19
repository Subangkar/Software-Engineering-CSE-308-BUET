package StateDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class VendingMachine {
	
	private VendorMachineState vendorMachineState;
	
	int[] coinSupply = {8,10,10,5,10,2}; // 5,10,20,50,100,500
	
	ArrayList<DrinkSupply> drinkSupplyList;
	double insertedCash;
	
	public double getInsertedCash() {
		return insertedCash;
	}
	
	public void setInsertedCash( double insertedCash ) {
		this.insertedCash = insertedCash;
	}
	
	VendingMachine( DrinkSupply[] drinkSupplyList){
		vendorMachineState = new InitialState( this );
		this.drinkSupplyList = new ArrayList(Arrays.asList(drinkSupplyList));
		insertedCash = 0;
	}
	
	void setState(VendorMachineState state) {
		this.vendorMachineState = state;
	}
	
	public VendorMachineState getVendorMachineState() {
		return vendorMachineState;
	}
	
	void insertCoin(){
		vendorMachineState.insertCoin();
	}
	
	void selectItem(){
		System.out.println("Enter your Preferred Drinks Name: ");
		String drinks = new Scanner(System.in).next();
		vendorMachineState.selectDrinks( );
	}
	
	void getDrinks(){
	
	}
	
	void getMoney(){
	
	}
	
	
	public void showAvailableItems(){
		for (DrinkSupply drink:drinkSupplyList){
			System.out.println(">> " + drink.name +" "+ drink.pricePerCan + "$");
		}
	}
	
	public void addDrinks(DrinkSupply drinkSupply){
		drinkSupplyList.add( drinkSupply );
	}
}
