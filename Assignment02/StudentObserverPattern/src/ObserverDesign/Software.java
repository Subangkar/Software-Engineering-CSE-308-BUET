package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Subangkar on 18-Jun-18.
 */
public class Software {
	
	private String info;
	private List<Observer> observers;
	
	Software()
	{
		observers = new ArrayList<>(  );
		info = "";
	}
	
	void subscribe(Observer observer){
		observers.add( observer );
	}
	
	void unsubscribe(Observer observer){
		observers.remove( observer );
	}
	
	void notifyAllObservers(){
		for(Observer observer:observers){
			observer.sendMail();
		}
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo( String info ) {
		this.info = info;
		notifyAllObservers();
	}
}
