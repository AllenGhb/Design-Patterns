package headfirst.designpatterns.combining.factory.duck;

import headfirst.designpatterns.combining.factory.Quackable;

public class DuckCall implements Quackable {
 
	public void quack() {
		System.out.println("Kwak");
	}
 
	public String toString() {
		return "duck Call";
	}
}
