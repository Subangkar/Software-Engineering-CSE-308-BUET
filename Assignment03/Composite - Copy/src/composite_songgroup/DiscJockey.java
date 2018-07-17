package composite_songgroup;

public class DiscJockey{
	
	iComposite songList;
	
	// newSongList contains every Leaf, Composite,
	// and any Songs saved in SongGroups
	
	public DiscJockey( iComposite newSongList){
		
		songList = newSongList;
		
	}
	
	// Calls the displaySongInfo() on every Leaf
	// or Composite stored in songList
	
	public void getSongList(){
		
		songList.displaySongInfo();
		
	}
	
}
