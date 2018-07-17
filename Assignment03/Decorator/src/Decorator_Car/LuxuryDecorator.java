package Decorator_Car;

public class LuxuryDecorator extends Decorator {

	public LuxuryDecorator( Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxury Decorator_Car.Car.");
	}
}

