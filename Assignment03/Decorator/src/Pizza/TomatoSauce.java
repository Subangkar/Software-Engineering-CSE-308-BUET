package Pizza;

public class TomatoSauce extends ToppingDecorator {
	
	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Sauce");
	}
	
	// Returns the result of calling getDescription() for
	// Pizza.PlainPizza, Pizza.Mozzarella and then Pizza.TomatoSauce
	
	public String getDescription(){
		
		return tempPizza.getDescription() + ", tomato sauce";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of Sauce: " + .35);
		
		return tempPizza.getCost() + .35;
		
	}
	
}