package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	private List<Observer> subscribers;
	
	public Observable(){
		subscribers=new ArrayList<>();
	}
	
	public void subscribe(Observer observer){
		subscribers.add(observer);
	}
	
	public void cancelSubcribe(Observer observer){
		if(subscribers.contains(observer))
			subscribers.remove(observer);
	}
	
	public void notifyObserver(){
		for(Observer observer:subscribers){
			observer.publish(this);
		}
	}
	
	public abstract String getContent();
}