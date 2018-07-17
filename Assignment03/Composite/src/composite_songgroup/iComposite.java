package composite_songgroup;

// This acts as an interface for every Leaf (Leaf)
// and Composite (Composite) we create

import java.util.ArrayList;

public abstract class iComposite {
	
	// We throw UnsupportedOperationException so that if
	// it doesn't make sense for a song, or song group
	// to inherit a method they can just inherit the
	// default implementation
	
	int age;
	int sal;
	int extRev;
	int per;
	String type;
	
	iComposite() {
		age = sal = extRev = per = 0;
		type = "";
	}
	
	// This allows me to add components
	public void add( iComposite newIComposite ) {
		throw new UnsupportedOperationException();
	}
	
	// This allows me to remove components
	public void remove( String name ) {
		
		throw new UnsupportedOperationException();
		
	}
	
	// This allows me to get components
	
	public iComposite getComponent( int componentIndex ) {
		throw new UnsupportedOperationException();
	}
	
	// This allows me to retrieve song names
	public String getSongName() {
		throw new UnsupportedOperationException();
	}
	
	// This allows me to retrieve band names
	public String getBandName() {
		throw new UnsupportedOperationException();
	}
	
	// This allows me to retrieve release year
	public int getReleaseYear() {
		throw new UnsupportedOperationException();
	}
	
	// When this is called by a class object that extends
	// iComposite it will print out information
	// specific to the Leaf or Composite
	
	public void displayAge() {
		throw new UnsupportedOperationException();
	}
	
	public void displaySalary() {
		throw new UnsupportedOperationException();
	}
	
	public void displayComm() {
		throw new UnsupportedOperationException();
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge( int age ) {
		this.age = age;
	}
	
	public int getSal() {
		return sal;
	}
	
	public void setSal( int sal ) {
		this.sal = sal;
	}
	
	public int getExtRev() {
		return extRev;
	}
	
	public void setExtRev( int extRev ) {
		this.extRev = extRev;
	}
	
	public int getPer() {
		return per;
	}
	
	public void setPer( int per ) {
		this.per = per;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType( String type ) {
		this.type = type;
	}
	
}