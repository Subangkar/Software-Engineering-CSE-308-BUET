package Pizza;

public class PizzaMaker {
	
	public static void main(String[] args){
		
		// The Pizza.PlainPizza object is sent to the Pizza.Mozzarella constructor
		// and then to the Pizza.TomatoSauce constructor
		
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		
		System.out.println("Price: " + basicPizza.getCost());
		
	}
	
}