package FactoryDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
public class CoffeeFactory {
	
	public Coffee produceCoffee( String type ) {
		if (type == null) return null;
		
		if (type.equalsIgnoreCase( "CoffeeA" )) return new CoffeeA();
		
		if (type.equalsIgnoreCase( "CoffeeB" )) return new CoffeeB();
		
		if (type.equalsIgnoreCase( "CoffeeC" )) return new CoffeeC();
		
		return null;
	}
}
