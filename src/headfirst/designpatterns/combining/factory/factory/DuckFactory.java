package headfirst.designpatterns.combining.factory.factory;

import headfirst.designpatterns.combining.factory.Quackable;
import headfirst.designpatterns.combining.factory.duck.DuckCall;
import headfirst.designpatterns.combining.factory.duck.MallardDuck;
import headfirst.designpatterns.combining.factory.duck.RedheadDuck;
import headfirst.designpatterns.combining.factory.duck.RubberDuck;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/28
 */
public class DuckFactory extends AbstractDuckFactory{

    @Override
    Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
