package headfirst.designpatterns.combining.factory.duck;

import headfirst.designpatterns.combining.factory.Quackable;

public class RedheadDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}
}
