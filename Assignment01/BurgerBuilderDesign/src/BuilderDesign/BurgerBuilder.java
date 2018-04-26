package BuilderDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
public interface BurgerBuilder {

	void addPatty();
	
	void addSauce();
	
	void addCheese();
	
	Burger getBurger();
}
