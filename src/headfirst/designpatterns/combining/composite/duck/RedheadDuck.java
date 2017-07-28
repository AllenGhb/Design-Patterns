package headfirst.designpatterns.combining.composite.duck;

import headfirst.designpatterns.combining.composite.Quackable;

public class RedheadDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}

	public String toString() {
		return "Redhead duck";
	}
}
