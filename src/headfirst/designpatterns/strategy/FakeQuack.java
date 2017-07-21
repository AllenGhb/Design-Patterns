package headfirst.designpatterns.strategy;

/**
 * Created by Administrator on 2017/7/20 0020.
 */
public class FakeQuack implements  QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
