package headfirst.designpatterns.combining.composite.duck;

import headfirst.designpatterns.combining.composite.Quackable;

public class DecoyDuck implements Quackable {
 
	public void quack() {
		System.out.println("<< Silence >>");
	}
 
	public String toString() {
		return "Decoy duck";
	}
}
