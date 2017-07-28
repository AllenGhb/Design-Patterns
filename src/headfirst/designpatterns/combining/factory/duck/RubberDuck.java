package headfirst.designpatterns.combining.factory.duck;

import headfirst.designpatterns.combining.factory.Quackable;

public class RubberDuck implements Quackable {
 
	public void quack() {
		System.out.println("Squeak");
	}
  
	public String toString() {
		return "Rubber duck";
	}
}
