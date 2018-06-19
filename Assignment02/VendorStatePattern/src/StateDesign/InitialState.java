package StateDesign;

import java.util.Scanner;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class InitialState implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public InitialState( VendingMachine vendingMachine ) {
		System.out.println("Machine in InitialState");
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin( ) {
		System.out.print( "Enter an amount: " );
		double cash = new Scanner( System.in ).nextDouble();
		vendingMachine.setInsertedCash( cash );
		if(vendingMachine.getInsertedCash()>0){
			vendingMachine.setState( new HasCoinState( vendingMachine ) );
		}
		else {
			System.out.println(":) Enter a valid amount");
		}
	}
	
	@Override
	public void selectDrinks() {
		System.out.println(":( you must insert coin.");
	}
	
	@Override
	public void deliverDrinks() {
		System.out.println(":( no coin inserted.");
	}
	
	@Override
	public void returnExtraCurrency() {
		System.out.println(":( no coin inserted.");
	}
}
