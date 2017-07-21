package headfirst.designpatterns.strategy;

/**
 * 翅膀飞行
 * Created by Administrator on 2017/7/20 0020.
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
