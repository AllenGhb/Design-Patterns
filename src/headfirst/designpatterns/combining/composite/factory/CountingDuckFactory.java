package headfirst.designpatterns.combining.composite.factory;

import headfirst.designpatterns.combining.composite.Quackable;
import headfirst.designpatterns.combining.composite.decorator.QuackCounter;
import headfirst.designpatterns.combining.composite.duck.DuckCall;
import headfirst.designpatterns.combining.composite.duck.MallardDuck;
import headfirst.designpatterns.combining.composite.duck.RedheadDuck;
import headfirst.designpatterns.combining.composite.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
