package StateDesign;

/**
 * Created by Subangkar on 19-Jun-18.
 */
public class Main {
	
	public static void main( String[] args ) {
		DrinkSupply[] drinkSupply = {new DrinkSupply( "Dew",25,3 ),
				new DrinkSupply( "RC",25,5 ),
				new DrinkSupply( "Coca-Cola",25,1 ),
				new DrinkSupply( "Fanta",25,7 ),};
		
		VendingMachine vendingMachine = new VendingMachine( drinkSupply );
		
	}
	
}
