package headfirst.designpatterns.strategy;

/**
 * 诱饵鸭
 * Created by Administrator on 2017/7/20 0020.
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
