package headfirst.designpatterns.combining.observer.duck;

import headfirst.designpatterns.combining.observer.Quackable;
import headfirst.designpatterns.combining.observer.observer.Observable;
import headfirst.designpatterns.combining.observer.observer.Observer;

public class RubberDuck implements Quackable {
	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
  
	public String toString() {
		return "Rubber duck";
	}
}
