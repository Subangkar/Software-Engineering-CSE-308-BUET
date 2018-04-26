package FactoryDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
public class CoffeeB implements Coffee {
	
	
	@Override
	public void prepare() {
		System.out.println("CoffeeType : CoffeeB");
		System.out.println("Caffeine : Yes\n"+"Milk : Yes\n"+"Sugar : No\n");
	}
}
