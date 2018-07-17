package composite_songgroup;

public class Leaf extends iComposite {
	
	private String name;

	public Leaf( String name ) {
		this.name = name;

	}
	
	public void displayAge() {
		System.out.println( "Age of " + getName() + " :" + getAge() );
	}
	
	public void displaySalary() {
		System.out.println( "Salary of " + getName() + " :" + getSal() );
	}
	
	public void displayComm() {
//		System.out.println( "Comm % :" );
		System.out.println( "Comm of " + getName() + " :" + getPer() );
	}
	
	String getName() {
		return name;
	}
	
	public void remove( String name ) {
	}
}
