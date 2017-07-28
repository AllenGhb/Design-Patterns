package headfirst.designpatterns.combining.factory.duck;

import headfirst.designpatterns.combining.factory.Quackable;

public class MallardDuck implements Quackable {
 
	public void quack() {
		System.out.println("Quack");
	}
 
	public String toString() {
		return "Mallard duck";
	}
}
