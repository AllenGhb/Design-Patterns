package headfirst.designpatterns.combining.decorator.duck;

import headfirst.designpatterns.combining.decorator.Quackable;

public class DuckCall implements Quackable {
 
	public void quack() {
		System.out.println("Kwak");
	}
 
	public String toString() {
		return "duck Call";
	}
}
