package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Subangkar on 18-Jun-18.
 */
// Subject
public class Software {
	
	private String info; // state
	private List<Observer> observers; // keeps subscription list
	
	public Software()
	{
		observers = new ArrayList<>(  );
		info = "";
	}
	
	public void subscribe(Observer observer){
		observers.add( observer );
	}
	
	public void unsubscribe(Observer observer){
		observers.remove( observer );
	}
	
	public void notifyAllObservers(){
		for(Observer observer:observers){
			observer.sendMail();
		}
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo( String info ) {
		System.out.println("\nInfo Changed in Software : "+info);
		this.info = info;
		notifyAllObservers();
	}
}
