package headfirst.designpatterns.combining.composite.adapter;

import headfirst.designpatterns.combining.composite.Quackable;
import headfirst.designpatterns.combining.composite.goose.Goose;

public class GooseAdapter implements Quackable {
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
 
	public void quack() {
		goose.honk();
	}

	public String toString() {
		return "Goose pretending to be a duck";
	}
}
