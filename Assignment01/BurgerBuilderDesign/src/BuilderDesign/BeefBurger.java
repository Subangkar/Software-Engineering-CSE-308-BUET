package BuilderDesign;

/**
 * Created by Subangkar on 27-Apr-18.
 */
class BeefBurger implements BurgerBuilder {
	
	private Burger burger;
	
	BeefBurger() {
		System.out.println( "Beef Burger Preparing Started :: " );
		burger = new Burger();
	}
	
	@Override
	public void addPatty() {
		burger.add( "Beef patty added" );
	}
	
	@Override
	public void addCheese() {
		burger.add( "added Beef cheese" );
	}
	
	@Override
	public void addSauce() {
		burger.add( "added sauce considering Beef Burger" );
	}
	
	@Override
	public Burger getBurger() {
		return burger;
	}
}
