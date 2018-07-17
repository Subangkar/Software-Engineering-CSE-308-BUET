package Decorator_Car;

public abstract class Decorator implements Car {

	protected Car car;
	
	Decorator( Car c ){
		this.car=c;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
	}

}

