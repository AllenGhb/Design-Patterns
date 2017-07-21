package headfirst.designpatterns.strategy;

/**
 * 不会发声
 * Created by Administrator on 2017/7/20 0020.
 */
public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
