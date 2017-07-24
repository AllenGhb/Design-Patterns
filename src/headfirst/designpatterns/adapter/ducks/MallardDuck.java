package headfirst.designpatterns.adapter.ducks;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
