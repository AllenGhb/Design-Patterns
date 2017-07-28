package headfirst.designpatterns.combining.factory.factory;

import headfirst.designpatterns.combining.factory.Quackable;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/28
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}
