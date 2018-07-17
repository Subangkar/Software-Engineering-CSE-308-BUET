package StateDesign;

import java.util.Scanner;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class HasCoinState implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public HasCoinState( VendingMachine vendingMachine ) {
		System.out.println( "Machine in HasCoinState" );
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin() {
		System.out.println(vendingMachine.getInsertedCash()+"$ Coin Already Inserted");
		System.out.print( "Enter more amount: " );
		double cash = new Scanner( System.in ).nextDouble();
		if (cash > 0) {
			vendingMachine.setInsertedCash( vendingMachine.getInsertedCash()+cash );
		} else {
			System.out.println( ":) Not a valid amount" );
		}
	}
	
	@Override
	public void selectDrinks() {
		vendingMachine.showAvailableItems();
		System.out.println( "Enter your Preferred Drinks Name: " );
		String drinks = new Scanner( System.in ).next();
		vendingMachine.setSelectedDrinkName( drinks );

		boolean hasDrink, hasEnoughCash, hasEnoughCan;
		hasDrink = hasEnoughCash = hasEnoughCan = false;
		for (DrinkSupply drinkSupply : vendingMachine.getDrinkSupplyList()) {
			if (drinkSupply.name.equalsIgnoreCase( vendingMachine.getSelectedDrinkName() )) {
				hasDrink = true;
				vendingMachine.setSelectedDrink( drinkSupply );
				if (drinkSupply.noOfCans > 0) hasEnoughCan = true;
				if (drinkSupply.pricePerCan <= vendingMachine.getInsertedCash()) hasEnoughCash = true;
				break;
			}
		}
		
		if (hasDrink && hasEnoughCan && hasEnoughCash) {
			vendingMachine.setState( new HasDrinkState( vendingMachine ) );
			return;
		}
		else if (!hasDrink) System.out.println( ":( Sorry Drinks Not Available in Inventory." );
		else if (!hasEnoughCan) System.out.println( ":( Sorry Drinks supply has been finished." );
		else if (!hasEnoughCash) System.out.println( ":( Not enough cash inserted." );
		
		System.out.println( ":( Select another Drinks" );
		vendingMachine.setSelectedDrinkName( "" );
		vendingMachine.setSelectedDrink( null );
	}
	
	@Override
	public void returnExtraCurrency() {
		if (vendingMachine.getInsertedCash() > 0) {
			System.out.println( "Cash Returned: " + vendingMachine.getInsertedCash() );
			vendingMachine.setInsertedCash( 0 );
		}
		else {
			System.out.println( "No cash to return" );
		}
		vendingMachine.setState( new InitialState( vendingMachine ) );
	}
	
	@Override
	public void getDrink() {
		System.out.println(":( Drink Not Selected");
	}
	
}
