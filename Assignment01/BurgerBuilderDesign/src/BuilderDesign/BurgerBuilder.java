package BuilderDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
interface BurgerBuilder {

	void addPatty();
	
	void addCheese();
	
	void addSauce();
	
	Burger getBurger();
}
