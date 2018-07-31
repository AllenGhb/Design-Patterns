package headfirst.designpatterns.adapter.ducks;

/**
 * @Discription: 野生火鸡 实现火鸡行为
 * @Author: allen
 * @Date: 2017/7/24
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
