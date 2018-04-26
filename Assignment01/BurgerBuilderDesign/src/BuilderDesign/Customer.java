package BuilderDesign;

public class Customer {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        
        BurgerBuilder chickenBurger = new ChickenBurger();
        waiter.prepare( chickenBurger );
        Burger burger1 = chickenBurger.getBurger();
        burger1.show();
	
	    BurgerBuilder beefBurger = new BeefBurger();
	    waiter.prepare( beefBurger );
	    Burger burger2 = beefBurger.getBurger();
	    burger2.show();
    }
}
