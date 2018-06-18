package ObserverDesign;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class Student extends Observer {
	
	Student(Software software) {
		this.software = software;
		this.software.subscribe( this );
	}
	
	@Override
	public void sendMail() {
		System.out.println("E-mail from Subscribed Software:");
		System.out.println("New Info "+software.getInfo());
	}
}
