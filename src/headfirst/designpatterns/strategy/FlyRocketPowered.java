package headfirst.designpatterns.strategy;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
