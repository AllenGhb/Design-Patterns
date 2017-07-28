package headfirst.designpatterns.combining.decorator.decorator;


import headfirst.designpatterns.combining.decorator.Quackable;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    @Override
    public String toString() {
        return duck.toString();
    }
}
