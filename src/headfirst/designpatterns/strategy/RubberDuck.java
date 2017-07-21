package headfirst.designpatterns.strategy;

/**
 * 橡胶鸭
 * Created by Administrator on 2017/7/20 0020.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
