package headfirst.designpatterns.combining.observer.factory;

import headfirst.designpatterns.combining.observer.Quackable;
import headfirst.designpatterns.combining.observer.duck.DuckCall;
import headfirst.designpatterns.combining.observer.duck.MallardDuck;
import headfirst.designpatterns.combining.observer.duck.RedheadDuck;
import headfirst.designpatterns.combining.observer.duck.RubberDuck;

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
