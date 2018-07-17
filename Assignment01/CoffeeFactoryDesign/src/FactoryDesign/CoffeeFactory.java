package FactoryDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
public class CoffeeFactory {
	
	private static CoffeeFactory instance = null;
	
	private CoffeeFactory() {
		System.out.println( "World's only one coffee factory has initiated its service :)\n" );
	}
	
	public static CoffeeFactory getInstance() {
		if (instance == null) instance = new CoffeeFactory();
		return instance;
	}
	
	public Coffee produceCoffee( String type ) {
		if (type == null) return null;
		
		if (type.equalsIgnoreCase( "CoffeeA" )) return new CoffeeA();
		
		if (type.equalsIgnoreCase( "CoffeeB" )) return new CoffeeB();
		
		if (type.equalsIgnoreCase( "CoffeeC" )) return new CoffeeC();
		
		return null;
	}
}
