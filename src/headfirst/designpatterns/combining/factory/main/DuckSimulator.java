package headfirst.designpatterns.combining.factory.main;

import headfirst.designpatterns.combining.factory.Quackable;
import headfirst.designpatterns.combining.factory.adapter.GooseAdapter;
import headfirst.designpatterns.combining.factory.decorator.QuackCounter;
import headfirst.designpatterns.combining.factory.factory.AbstractDuckFactory;
import headfirst.designpatterns.combining.factory.factory.CountingDuckFactory;
import headfirst.designpatterns.combining.factory.goose.Goose;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/28
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nduck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() +
                " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }

}
