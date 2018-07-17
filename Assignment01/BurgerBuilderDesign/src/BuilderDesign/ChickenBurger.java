package BuilderDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
class ChickenBurger implements BurgerBuilder {
	
	private Burger burger;
	
	ChickenBurger() {
		System.out.println( "Chicken Burger Preparing Started :: " );
		burger = new Burger();
	}
	
	@Override
	public void addPatty() {
		burger.add( "Chicken patty added" );
	}
	
	@Override
	public void addCheese() {
		burger.add( "added Chicken cheese" );
	}
	
	@Override
	public void addSauce() {
		burger.add( "added sauce considering Chicken Burger" );
	}
	
	@Override
	public Burger getBurger() {
		return burger;
	}
}
