package StateDesign;

import java.util.Scanner;

/**
 * Created by Subangkar on 23-Jun-18.
 */
public class HasDrinkState implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public HasDrinkState( VendingMachine vendingMachine ) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin() {
		System.out.println( ":( Drinks Selected. Can't Insert Coin Now." );
	}
	
	@Override
	public void selectDrinks() {
		System.out.println( ":( Drinks Already Selected. Change (Y/N) ?." );
		char opt = (char) new Scanner( System.in ).nextByte();
		if (opt == 'Y') {
			vendingMachine.setState( new HasCoinState( vendingMachine ) );
		}
	}
	
	@Override
	public void returnExtraCurrency() {
		System.out.println( ":( Drinks Already Selected. First Cancel Selection (Y/N) ?." );
		char opt = (char) new Scanner( System.in ).nextByte();
		if (opt == 'Y') {
			vendingMachine.setState( new HasCoinState( vendingMachine ) );
		}
	}
	
	@Override
	public void getDrink() {
		DrinkSupply drink = vendingMachine.getSelectedDrink();
		
		vendingMachine.setInsertedCash( vendingMachine.getInsertedCash() - drink.pricePerCan );
		vendingMachine.setCash( vendingMachine.getInsertedCash() + drink.pricePerCan );
		drink.noOfCans--;
		
		System.out.println( "Can Delivered: " + drink.name );
		System.out.println( "Cash Deducted: " + drink.pricePerCan );
		
	}
}
