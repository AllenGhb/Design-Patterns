package headfirst.designpatterns.combining.observer.decorator;

import headfirst.designpatterns.combining.observer.Quackable;
import headfirst.designpatterns.combining.observer.observer.Observer;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/31
 */
public class QuackCounter implements Quackable{

    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }


    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    public String toString(){
        return duck.toString();
    }

}
