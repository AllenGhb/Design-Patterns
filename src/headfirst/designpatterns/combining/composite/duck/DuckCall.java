package headfirst.designpatterns.combining.composite.duck;

import headfirst.designpatterns.combining.composite.Quackable;

public class DuckCall implements Quackable {
 
	public void quack() {
		System.out.println("Kwak");
	}
 
	public String toString() {
		return "duck Call";
	}
}
