package headfirst.designpatterns.combining.observer.main;

import headfirst.designpatterns.combining.observer.Quackable;
import headfirst.designpatterns.combining.observer.adapter.GooseAdapter;
import headfirst.designpatterns.combining.observer.decorator.QuackCounter;
import headfirst.designpatterns.combining.observer.factory.AbstractDuckFactory;
import headfirst.designpatterns.combining.observer.factory.CountingDuckFactory;
import headfirst.designpatterns.combining.observer.goose.Goose;
import headfirst.designpatterns.combining.observer.observer.Flock;
import headfirst.designpatterns.combining.observer.observer.Quackologist;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/31
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){

        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nduck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " +
                QuackCounter.getQuacks() +
                " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }


}
