package ObserverDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
// ConcreteObserver
public class Student extends Observer {
	
	public Student( Software software , String studentName ) {
		subscribeService(software);
		this.name = studentName;
	}
	
	public Student(String studentName ) {
		this.name = studentName;
	}
	
	@Override
	public void sendMail() {
		System.out.println( name + " :" );
		System.out.println( "E-mail from Subscribed Software :" );
		System.out.println( "Updated Info :" + software.getInfo() );
	}
	
	
	public void subscribeService(Software software)
	{
		this.software = software;
		this.software.subscribe( this );
	}
	
	public void unsubscribeService()
	{
		this.software.unsubscribe( this );
	}
	
	private String name;
}
