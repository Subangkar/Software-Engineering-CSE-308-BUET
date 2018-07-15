package Pizza;// Has a "Has a" relationship with Pizza.Pizza. This is an
// Aggregation Relationship

public abstract class ToppingDecorator implements Pizza {
	
	Pizza tempPizza;
	
	// Assigns the type in,stance to this attribute
	// of a Pizza.Pizza
	
	// All decorators can dynamically customize the Pizza.Pizza
	// instance Pizza.PlainPizza because of this
	
	public ToppingDecorator(Pizza newPizza){
		
		tempPizza = newPizza;
		
	}
	
	public String getDescription() {
		
		return tempPizza.getDescription();
		
	}
	
	public double getCost() {
		
		return tempPizza.getCost();
		
	}
	
}