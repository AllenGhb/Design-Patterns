package headfirst.designpatterns.combining.factory.decorator;

import headfirst.designpatterns.combining.factory.Quackable;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/28
 */
public class QuackCounter implements Quackable {

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

    public static  int getQuacks(){
        return numberOfQuacks;
    }

    public String toString(){
        return duck.toString();
    }

}
