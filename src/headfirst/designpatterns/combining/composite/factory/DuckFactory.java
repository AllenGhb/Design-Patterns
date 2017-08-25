package headfirst.designpatterns.combining.composite.factory;

import headfirst.designpatterns.combining.composite.Quackable;
import headfirst.designpatterns.combining.composite.duck.DuckCall;
import headfirst.designpatterns.combining.composite.duck.MallardDuck;
import headfirst.designpatterns.combining.composite.duck.RedheadDuck;
import headfirst.designpatterns.combining.composite.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
