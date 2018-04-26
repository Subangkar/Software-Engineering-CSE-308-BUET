package BuilderDesign;

import java.util.ArrayList;

/**
 * Created by Subangkar on 27-Apr-18.
 */
public class Burger {
	
	ArrayList< String > elements;
	
	Burger() {
		elements = new ArrayList<>();
	}
	
	
	void add( String elementName ) {
		if (elementName != null) elements.add( elementName );
	}
	
	void show() {
	
	}
	
}
