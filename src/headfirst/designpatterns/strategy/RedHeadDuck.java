package headfirst.designpatterns.strategy;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new  Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
