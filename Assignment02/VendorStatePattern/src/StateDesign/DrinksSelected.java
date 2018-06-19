package StateDesign;

/**
 * Created by Subangkar on 19-Jun-18.
 */
public class DrinksSelected implements VendorMachineState {
	
	private VendingMachine vendingMachine;
	
	public DrinksSelected( VendingMachine vendingMachine ) {
		this.vendingMachine = vendingMachine;
	}
	
	
	@Override
	public void insertCoin() {
		System.out.println( ":( Sorry Drinks has been selected.Coin can't be inserted now." );
	}
	
	@Override
	public void selectDrinks() {
		System.out.println( ":) Drinks has been selected already." );
	}
	
	@Override
	public void deliverDrinks() {
		boolean hasDrink, hasEnoughCash, hasEnoughCan;
		hasDrink = hasEnoughCash = hasEnoughCan = false;
		DrinkSupply drink = null;
		for (DrinkSupply drinkSupply : vendingMachine.getDrinkSupplyList()) {
			if (drinkSupply.name.equalsIgnoreCase( vendingMachine.getSelectedDrinks() )) {
				hasDrink = true;
				if (drinkSupply.noOfCans > 0) hasEnoughCan = true;
				if (drinkSupply.pricePerCan <= vendingMachine.getInsertedCash()) hasEnoughCash = true;
				drink = drinkSupply;
				break;
			}
		}
		
		if (hasDrink && hasEnoughCan && hasEnoughCash) {
			
//			boolean canChange = true;
//
//			if(!canChange){
//
//			}
//			else {
				vendingMachine.setInsertedCash( vendingMachine.getInsertedCash() - drink.pricePerCan );
				drink.noOfCans--;
				
				System.out.println( "1 Can Delivered: " + drink.name );
				System.out.println( "Cash Deducted: " + drink.pricePerCan );
				
				if(vendingMachine.getInsertedCash()>0) vendingMachine.setState( new HasCoinState( vendingMachine ) );
				else {
					System.out.println("No cash to return");
					vendingMachine.setState( new InitialState( vendingMachine ) );
				}
				return;
//			}
		}
		else if (!hasDrink) System.out.println( ":( Sorry Drinks Not Available in Inventory." );
		else if (!hasEnoughCan) System.out.println( ":( Sorry Drinks supply has been finished." );
		else if (!hasEnoughCash) System.out.println( ":( Not enough cash inserted." );
		
		System.out.println("Select another Drinks or get return money");
		vendingMachine.setState( new HasCoinState( vendingMachine ) );
	}
	
	@Override
	public void returnExtraCurrency() {
		System.out.println(":) Drinks Ordered Can't return cash before delivering it");
	}
}
