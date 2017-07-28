package headfirst.designpatterns.combining.factory.factory;

import headfirst.designpatterns.combining.factory.Quackable;
import headfirst.designpatterns.combining.factory.decorator.QuackCounter;
import headfirst.designpatterns.combining.factory.duck.DuckCall;
import headfirst.designpatterns.combining.factory.duck.MallardDuck;
import headfirst.designpatterns.combining.factory.duck.RedheadDuck;
import headfirst.designpatterns.combining.factory.duck.RubberDuck;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/28
 */
public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
