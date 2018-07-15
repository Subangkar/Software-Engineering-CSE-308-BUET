package composite_songgroup;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite extends iComposite {
	
	// Contains any Songs or SongGroups that are added
	// to this ArrayList
	
	private ArrayList songComponents = new ArrayList();
	
	private String groupName;
	private String groupDescription;
	
	public Composite( String newGroupName, String newGroupDescription){
		
		groupName = newGroupName;
		groupDescription = newGroupDescription;
		
	}
	
	public String getGroupName() { return groupName; }
	public String getGroupDescription() { return groupDescription; }
	
	public void add( iComposite newIComposite ) {
		
		songComponents.add( newIComposite );
		
	}
	
	public void remove( iComposite newIComposite ) {
		
		songComponents.remove( newIComposite );
		
	}
	
	public iComposite getComponent( int componentIndex) {
		
		return (iComposite)songComponents.get(componentIndex);
		
	}
	
	public void displaySongInfo(){
		
		System.out.println(getGroupName() + " " +
				                   getGroupDescription() + "\n");
		
		// Cycles through and prints any Songs or SongGroups added
		// to this SongGroups ArrayList songComponents
		
		Iterator songIterator = songComponents.iterator();
		
		while(songIterator.hasNext()) {
			
			iComposite songInfo = (iComposite) songIterator.next();
			
			songInfo.displaySongInfo();
			
		}
		
	}
	
	
}