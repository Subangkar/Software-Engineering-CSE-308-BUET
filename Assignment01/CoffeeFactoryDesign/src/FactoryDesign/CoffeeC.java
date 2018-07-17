package FactoryDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
public class CoffeeC implements Coffee {
	
	
	@Override
	public void prepare() {
		System.out.println("CoffeeType : CoffeeC");
		System.out.println("Caffeine : Yes\n"+"Milk : Yes\n"+"Sugar : Yes\n");
	}
}
