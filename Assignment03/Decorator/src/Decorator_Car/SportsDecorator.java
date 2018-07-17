package Decorator_Car;

public class SportsDecorator extends Decorator {

	public SportsDecorator( Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Decorator_Car.Car.");
	}
}
