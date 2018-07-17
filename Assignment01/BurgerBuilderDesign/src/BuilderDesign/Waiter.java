package BuilderDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
class Waiter {
	
	void prepare( BurgerBuilder burgerBuilder ) {
		burgerBuilder.addPatty();
		burgerBuilder.addCheese();
		burgerBuilder.addSauce();
	}
	
}
