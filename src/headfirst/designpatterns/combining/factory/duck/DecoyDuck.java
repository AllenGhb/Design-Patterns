package headfirst.designpatterns.combining.factory.duck;

import headfirst.designpatterns.combining.factory.Quackable;

public class DecoyDuck implements Quackable {
 
	public void quack() {
		System.out.println("<< Silence >>");
	}
 
	public String toString() {
		return "Decoy duck";
	}
}
