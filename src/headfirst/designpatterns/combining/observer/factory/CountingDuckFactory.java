package headfirst.designpatterns.combining.observer.factory;

import headfirst.designpatterns.combining.observer.Quackable;
import headfirst.designpatterns.combining.observer.decorator.QuackCounter;
import headfirst.designpatterns.combining.observer.duck.DuckCall;
import headfirst.designpatterns.combining.observer.duck.MallardDuck;
import headfirst.designpatterns.combining.observer.duck.RedheadDuck;
import headfirst.designpatterns.combining.observer.duck.RubberDuck;

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
