package headfirst.designpatterns.combining.decorator.duck;

import headfirst.designpatterns.combining.decorator.Quackable;

public class DecoyDuck implements Quackable {
 
	public void quack() {
		System.out.println("<< Silence >>");
	}
 
	public String toString() {
		return "Decoy duck";
	}
}
