package headfirst.designpatterns.combining.decorator.adapter;

import headfirst.designpatterns.combining.decorator.Quackable;
import headfirst.designpatterns.combining.decorator.goose.Goose;

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
