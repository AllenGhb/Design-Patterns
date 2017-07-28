package headfirst.designpatterns.combining.decorator.duck;

import headfirst.designpatterns.combining.decorator.Quackable;

public class MallardDuck implements Quackable {
 
	public void quack() {
		System.out.println("Quack");
	}
 
	public String toString() {
		return "Mallard duck";
	}
}
