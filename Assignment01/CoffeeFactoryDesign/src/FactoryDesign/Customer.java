package FactoryDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
public class Customer {
	
	public static void main( String[] args ) {
		CoffeeFactory coffeeFactory = CoffeeFactory.getInstance();
		
		Coffee coffeea = coffeeFactory.produceCoffee( "COFFEEA" );
		coffeea.prepare();
		
		Coffee coffeeb = coffeeFactory.produceCoffee( "CoffeeB" );
		coffeeb.prepare();
		
		Coffee coffeec = coffeeFactory.produceCoffee( "coffeec" );
		coffeec.prepare();
	}
	
}
