package headfirst.designpatterns.strategy;

/**
 * 不会飞
 * Created by Administrator on 2017/7/20 0020.
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
