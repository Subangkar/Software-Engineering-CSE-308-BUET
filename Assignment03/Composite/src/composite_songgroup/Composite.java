package composite_songgroup;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends iComposite {
	
	// Contains any Songs or SongGroups that are added
	// to this ArrayList
	
	private ArrayList members = new ArrayList();
	
	public Composite( String type ) {
		super();
		setType( type );
	}
	
	
	public void add( iComposite newIComposite ) {
		
		for (Object member : members) {
			iComposite child = (iComposite) member;
			if(child.getType().equalsIgnoreCase( newIComposite.getType())){
				child.add( newIComposite );
				setSal( getSal() + newIComposite.getSal() );
				setPer( getPer() + newIComposite.getPer() );
				setAge( getAge() + newIComposite.getAge() );
			}
		}
	}
	
	public void remove( String name ) {
		
		for (Object member : members) {
			iComposite child = (iComposite) member;
//			child.displaySalary();
			child.remove( name );
		}
//		if (members.remove( newIComposite )) {
//			setSal( getSal() - newIComposite.getSal() );
//			setPer( getPer() - newIComposite.getPer() );
//			setAge( getAge() - newIComposite.getAge() );
//		}
	}
	
	public iComposite getComponent( int componentIndex ) {
		
		return (iComposite) members.get( componentIndex );
		
	}
	
	public void displayAge() {
		for (Object member : members) {
			iComposite child = (iComposite) member;
			child.displayAge();
		}
		System.out.println( "Age of " + type + getAge() );
	}
	
	public void displaySalary() {
		for (Object member : members) {
			iComposite child = (iComposite) member;
			child.displaySalary();
		}
		System.out.println( "Salary of " + type + " is " + getSal() );
	}
	
	public void displayComm() {
		for (Object member : members) {
			iComposite child = (iComposite) member;
			child.displayComm();
		}
		System.out.println( "Comm of " + type + getPer() );
	}
	
	
	
}