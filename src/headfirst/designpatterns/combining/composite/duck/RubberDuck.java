package headfirst.designpatterns.combining.composite.duck;

import headfirst.designpatterns.combining.composite.Quackable;

public class RubberDuck implements Quackable {
 
	public void quack() {
		System.out.println("Squeak");
	}
  
	public String toString() {
		return "Rubber duck";
	}
}
