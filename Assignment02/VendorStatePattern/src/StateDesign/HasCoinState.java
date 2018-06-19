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
		System.out.println(":/ Coin Already Inserted");
		System.out.print( "Enter an amount: " );
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
		vendingMachine.setSelectedDrinks( drinks );
		vendingMachine.setState( new DrinksSelected( vendingMachine ) );
	}
	
	@Override
	public void deliverDrinks() {
		System.out.println(":( No Drinks Selected.");
	}

	
	@Override
	public void returnExtraCurrency() {
		System.out.println("Cash Returned: "+vendingMachine.getInsertedCash());
		vendingMachine.setInsertedCash( 0 );
		vendingMachine.setState( new InitialState( vendingMachine ) );
	}
}
