package headfirst.designpatterns.strategy;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class MallardDuck extends  Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
