package headfirst.designpatterns.combining.ducks.main;

import headfirst.designpatterns.combining.ducks.Quackable;
import headfirst.designpatterns.combining.ducks.duck.DuckCall;
import headfirst.designpatterns.combining.ducks.duck.MallardDuck;
import headfirst.designpatterns.combining.ducks.duck.RedheadDuck;
import headfirst.designpatterns.combining.ducks.duck.RubberDuck;
import headfirst.designpatterns.strategy.Quack;

/**
 * @Discription: 鸭子模拟器
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

        System.out.println("\nduck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
