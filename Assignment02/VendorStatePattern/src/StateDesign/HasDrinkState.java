package StateDesign;

import java.util.Scanner;

/**
 * Created by Subangkar on 23-Jun-18.
 */
public class HasDrinkState implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public HasDrinkState( VendingMachine vendingMachine ) {
		System.out.println( "Machine in HasDrinkState" );
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin() {
		System.out.println( ":( Drinks Selected. Can't Insert Coin Now." );
	}
	
	@Override
	public void selectDrinks() {
		System.out.print( ":( Drinks Already Selected. Change Selection (Y/N)? : " );
		char opt = new Scanner( System.in ).next().charAt( 0 );
		if (opt == 'Y') {
			vendingMachine.setState( new HasCoinState( vendingMachine ) );
		}
	}
	
	@Override
	public void returnExtraCurrency() {
		System.out.print( ":( Drinks Already Selected. Cancel Delivery & get cash returned (Y/N)? : " );
		char opt = new Scanner( System.in ).next().charAt( 0 );
		if (opt == 'Y') {
			vendingMachine.setState( new HasCoinState( vendingMachine ) );
			vendingMachine.getReturnCash();
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
		
		vendingMachine.setSelectedDrinkName( "" );
		vendingMachine.setSelectedDrink( null );
		if(vendingMachine.getInsertedCash()>0)vendingMachine.setState( new HasCoinState( vendingMachine ) );
		else vendingMachine.setState( new InitialState( vendingMachine ) );
	}
}
