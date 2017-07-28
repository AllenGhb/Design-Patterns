package headfirst.designpatterns.combining.decorator.duck;

import headfirst.designpatterns.combining.decorator.Quackable;

public class RedheadDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}
}
