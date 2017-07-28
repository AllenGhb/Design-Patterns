package headfirst.designpatterns.combining.decorator.main;

import headfirst.designpatterns.combining.decorator.Quackable;
import headfirst.designpatterns.combining.decorator.adapter.GooseAdapter;
import headfirst.designpatterns.combining.decorator.decorator.QuackCounter;
import headfirst.designpatterns.combining.decorator.duck.DuckCall;
import headfirst.designpatterns.combining.decorator.duck.MallardDuck;
import headfirst.designpatterns.combining.decorator.duck.RedheadDuck;
import headfirst.designpatterns.combining.decorator.duck.RubberDuck;
import headfirst.designpatterns.combining.decorator.goose.Goose;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nduck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
