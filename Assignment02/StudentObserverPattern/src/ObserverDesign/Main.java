package ObserverDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class Main {
	
	public static void main( String[] args ) {
		
		Software academicUpdates = new Software();
		
		Student messi,neymar,ronaldo;
		messi = new Student( "Messi" );
		neymar = new Student( "Neymar" );
		ronaldo = new Student( "Ronaldo" );
		
		messi.subscribeService( academicUpdates );
		ronaldo.subscribeService( academicUpdates );
		
		academicUpdates.setInfo( "Class cancelled" );
		
		messi.unsubscribeService();
		
		neymar.subscribeService(academicUpdates);
		academicUpdates.setInfo( "CT @ Monday" );
		
		messi.subscribeService( academicUpdates );
		
		academicUpdates.setInfo( "Assignment on Design Pattern :(" );
	}
	
}
