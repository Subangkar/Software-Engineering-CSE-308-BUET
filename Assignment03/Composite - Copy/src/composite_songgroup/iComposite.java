package composite_songgroup;

// This acts as an interface for every Leaf (Leaf)
// and Composite (Composite) we create

public abstract class iComposite {
	
	// We throw UnsupportedOperationException so that if
	// it doesn't make sense for a song, or song group
	// to inherit a method they can just inherit the
	// default implementation
	
	// This allows me to add components
	
	public void add( iComposite newIComposite ) {
		
		throw new UnsupportedOperationException();
		
	}
	
	// This allows me to remove components
	
	public void remove( iComposite newIComposite ) {
		
		throw new UnsupportedOperationException();
		
	}
	
	// This allows me to get components
	
	public iComposite getComponent( int componentIndex) {
		
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
	
	public void displaySongInfo() {
		
		throw new UnsupportedOperationException();
		
	}
	
}