package headfirst.designpatterns.combining.adapter.main;

import headfirst.designpatterns.combining.adapter.Quackable;
import headfirst.designpatterns.combining.adapter.adapter.GooseAdapter;
import headfirst.designpatterns.combining.adapter.duck.DuckCall;
import headfirst.designpatterns.combining.adapter.duck.MallardDuck;
import headfirst.designpatterns.combining.adapter.duck.RedheadDuck;
import headfirst.designpatterns.combining.adapter.duck.RubberDuck;
import headfirst.designpatterns.combining.adapter.goose.Goose;
import headfirst.designpatterns.strategy.Quack;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nduck Simulator: With Goose Adapter");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
