package BuilderDesign;

import java.util.ArrayList;

/**
 * Created by Subangkar on 27-Apr-18.
 */
class Burger {
	
	private ArrayList< String > elements;
	
	Burger() {
		elements = new ArrayList<>();
	}
	
	void add( String elementName ) {
		if (elementName != null) elements.add( elementName );
	}
	
	void show() {
		for (String elem:elements) {
			System.out.println(elem);
		}
		System.out.println();
	}
	
}
